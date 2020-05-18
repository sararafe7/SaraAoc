package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;

public class CameraActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CAMERA_REQUEST = 0;
    private static final int GALLERY_REQUEST = 1;

    Button cameraBtn, galleryBtn, doneBtn;
    ImageView imageView;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        cameraBtn = findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(this);

        galleryBtn = findViewById(R.id.galleryBtn);
        galleryBtn.setOnClickListener(this);

        doneBtn = findViewById(R.id.done);
        doneBtn.setOnClickListener(this);

        imageView=findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View view) {
        if (view == cameraBtn){
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_REQUEST);
        }

        if (view == galleryBtn){
            Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i,GALLERY_REQUEST);
        }
        if (view == doneBtn) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        //if the request was from camera and the result was OK meaning the camera worked
        if (requestCode == CAMERA_REQUEST && resultCode == CameraActivity.RESULT_OK) {
            //the image captured is saved in the data object
            bitmap = (Bitmap) data.getExtras().get("data");
            //set image captured to be the new image
            imageView.setImageBitmap(bitmap);
        }

        else
            if (requestCode == GALLERY_REQUEST && resultCode == CameraActivity.RESULT_OK) {
                //URI - unified resource locator is something like URL but can hold different type of paths
// examples: file:///something.txt, http://www.example.com/, ftp://example.com
// A Uri object is usually used to tell a ContentProvider what we want to access by reference
                Uri targetUri = data.getData();
                try {
//Decode an input stream into a bitmap.
                    bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
                    imageView.setImageBitmap(bitmap);
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else {
            Toast.makeText(this, "Could not select image or take a photo", Toast.LENGTH_LONG).show();
        }
    }
}

