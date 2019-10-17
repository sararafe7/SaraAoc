package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class BreakfastActivity extends AppCompatActivity {

    ListView lviIngredients;
    ArrayList<IngredientsCheck> Ingredients = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

       // lesh 3'lt????? lviIngredients = findViewById(R.id.lvIngredients);


    }
}
