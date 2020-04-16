package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.MenuPopupWindow;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class AddRecipeActivity extends AppCompatActivity implements View.OnClickListener {

    EditText reNameEt, theAmOfDinersEt, ingredientsEt, ingRecoToAddEt, tiForPreEt,
            tiToMakeEt, recipeEt;
    Bitmap bitmap;
    Button doneBtn;
    DatabaseReference reff;
    Recipes recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        reNameEt = findViewById(R.id.reNameEt);
        theAmOfDinersEt = findViewById(R.id.theAmOfDinersEt);
        //ingredientsEt = findViewById(R.id.ingredientsEt);
        tiForPreEt = findViewById(R.id.tiForPreEt);
        tiToMakeEt = findViewById(R.id.tiToMakeEt);
        recipeEt = findViewById(R.id.recipeEt);
        doneBtn = findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(this);
        recipe = new Recipes();
        reff = FirebaseDatabase.getInstance().getReference().child("Recipe");
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
        double tiForPre = Double.parseDouble(tiForPreEt.toString().trim());
        double tiToMake = Double.parseDouble(tiToMakeEt.toString().trim());
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
    }
}
