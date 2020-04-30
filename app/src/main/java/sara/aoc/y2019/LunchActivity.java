package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class LunchActivity extends AppCompatActivity implements View.OnClickListener{
    Button lunchBtn1, lunchBtn2, backToMealsBtnLu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        lunchBtn1 = findViewById(R.id.lunchBtn1);
        lunchBtn1.setOnClickListener(this);

        lunchBtn2 = findViewById(R.id.lunchBtn2);
        lunchBtn2.setOnClickListener(this);

        backToMealsBtnLu = findViewById(R.id.backToMealsBtnLu);
        backToMealsBtnLu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == lunchBtn1){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            String recipeName = "Roasted Salmon with Green Beans and Tomatoes";
            i.putExtra("RECIPE_NAME", recipeName);
            startActivity(i);
        }

        if (view == lunchBtn2){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            String recipeName = "Greek Salad";
            i.putExtra("RECIPE_NAME", recipeName);
            startActivity(i);
        }

        if (view == backToMealsBtnLu) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }
    }

}
