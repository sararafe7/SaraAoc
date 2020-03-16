package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.MenuPopupWindow;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class AddRecipeActivity extends AppCompatActivity implements View.OnClickListener {

    EditText reNameEt, theAmOfDinersEt, ingredientsEt, ingRecoToAddEt, tiForPreEt,
            tiToMakeEt, recipeEt;
    Bitmap bitmap;
    Button doneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        reNameEt = findViewById(R.id.reNameEt);
        theAmOfDinersEt = findViewById(R.id.theAmOfDinersEt);
        ingredientsEt = findViewById(R.id.ingredientsEt);
        ingRecoToAddEt = findViewById(R.id.ingRecoToAddEt);
        tiForPreEt = findViewById(R.id.tiForPreEt);
        tiToMakeEt = findViewById(R.id.tiToMakeEt);
        recipeEt = findViewById(R.id.recipeEt);
        doneBtn = findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(this);
        //doneBtn = findViewById(R.id.)
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
    }
}
