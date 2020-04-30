package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakfastActivity extends AppCompatActivity implements View.OnClickListener {

    Button breakfastBtn1, breakfastBtn2, backToMealsBtnBr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        breakfastBtn1 = findViewById(R.id.breakfastBtn1);
        breakfastBtn1.setOnClickListener(this);

        breakfastBtn2 = findViewById(R.id.breakfastBtn2);
        breakfastBtn2.setOnClickListener(this);

        backToMealsBtnBr = findViewById(R.id.backToMealsBtnBr);
        backToMealsBtnBr.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == breakfastBtn1){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            String recipeName = "Omelet";
            i.putExtra("RECIPE_NAME", recipeName);
            startActivity(i);
        }

        if (view == breakfastBtn2){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            String recipeName = "Pancakes";
            i.putExtra("RECIPE_NAME", recipeName);
            startActivity(i);
        }

        if (view == backToMealsBtnBr) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }
    }
}

