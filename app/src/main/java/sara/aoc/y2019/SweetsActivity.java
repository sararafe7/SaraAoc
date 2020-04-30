package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SweetsActivity extends AppCompatActivity implements View.OnClickListener{
    Button sweetsBtn1, sweetsBtn2, backToMealsBtnSw;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweets);

            sweetsBtn1 = findViewById(R.id.sweetsBtn1);
            sweetsBtn1.setOnClickListener(this);

            sweetsBtn2 = findViewById(R.id.sweetsBtn2);
            sweetsBtn2.setOnClickListener(this);

            backToMealsBtnSw = findViewById(R.id.backToMealsBtnSw);
            backToMealsBtnSw.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {

        if (view == sweetsBtn1){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            String recipeName = "Earthquake Cake";
            i.putExtra("RECIPE_NAME", recipeName);
            startActivity(i);
        }

        if (view == sweetsBtn2){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            String recipeName = "Brownies";
            i.putExtra("RECIPE_NAME", recipeName);
            startActivity(i);
        }


        if (view == backToMealsBtnSw) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }
    }

}
