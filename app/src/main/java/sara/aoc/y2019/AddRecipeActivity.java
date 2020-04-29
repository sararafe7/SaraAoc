package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class AddRecipeActivity extends AppCompatActivity {

    /*EditText reNameEt, theAmOfDinersEt, ingredientsEt, tiForPreEt,
            tiToMakeEt, recipeEt;
    Button doneBtn;
    DatabaseReference reff;
    Recipes recipe;

    private static final int CAMERA_REQUEST = 0;
    private static final int GALLERY_REQUEST = 1;

    Button cameraBtn, galleryBtn;
    ImageView imageView;
    Bitmap bitmap;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

  /*      reNameEt = findViewById(R.id.reNameEt);
        theAmOfDinersEt = findViewById(R.id.theAmOfDinersEt);
        //ingredientsEt = findViewById(R.id.ingredientsEt);
        tiForPreEt = findViewById(R.id.tiForPreEt);
        tiToMakeEt = findViewById(R.id.tiToMakeEt);
        recipeEt = findViewById(R.id.recipeEt);
        doneBtn = findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(this);
        /////////////recipe = new Recipes();
        reff = FirebaseDatabase.getInstance().getReference().child("Recipe");

        cameraBtn = findViewById(R.id.cameraBtn);
        cameraBtn.setOnClickListener(this);

        galleryBtn = findViewById(R.id.galleryBtn);
        galleryBtn.setOnClickListener(this);

        imageView=findViewById(R.id.imageView);
    }
    public void showMultiSelection() {
        final String[] items = getResources().getStringArray(R.array.Category1);

        final ArrayList<Integer> selectedList = new ArrayList<>();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Select Provider");
        builder.setMultiChoiceItems(items, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if (isChecked) {
                            selectedList.add(which);
                        } else if (selectedList.contains(which)) {
                            selectedList.remove(which);
                        }
                    }
                });
        builder.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ArrayList<String> selectedStrings = new ArrayList<>();
                for (int j = 0; j < selectedList.size(); j++) {
                    selectedStrings.add(items[selectedList.get(j)]);
                }
                Toast.makeText(getApplicationContext(), "Selected Items: " + Arrays.toString(selectedStrings.toArray()), Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
    @Override
    public void onClick(View view) {
        showMultiSelection();
        int theAmOfDiners = Integer.parseInt(theAmOfDinersEt.toString().trim());
       // ArrayList<String> ingredients = ArrayList.parse
        int tiForPre = Integer.parseInt(tiForPreEt.toString().trim());
        int tiToMake = Integer.parseInt(tiToMakeEt.toString().trim());
        recipe.setReName(reNameEt.getText().toString().trim());
        recipe.setTheAmOfDiners(theAmOfDiners);
        //recipe.setIngredients(IngredientsEt);
        recipe.setTiForPre(tiForPre);
        recipe.setTiToMake(tiToMake);
        recipe.setReName(recipeEt.getText().toString().trim());
        reff.push().setValue(recipe);
        Toast.makeText(AddRecipeActivity.this, "data inserted successfully", Toast.LENGTH_LONG).show();

        if (view == doneBtn) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }

        if (view == cameraBtn){
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_REQUEST);
        }

        if (view == galleryBtn){
            Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i,GALLERY_REQUEST);
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
            Uri targetUri = data.getData();
            try {
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
                imageView.setImageBitmap(bitmap);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else {
            Toast.makeText(this, "Could not select image or take photo", Toast.LENGTH_LONG).show();
        }*/
    }
}

