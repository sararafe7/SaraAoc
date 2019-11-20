package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import android.widget.ListView;


public class BreakfastActivity extends AppCompatActivity {

    ListView lvIngredients;
    CustomAdapter2 adapter2;
    ArrayList<IngredientsCheck> arrIc = new ArrayList<IngredientsCheck>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        arrIc.add(new IngredientsCheck(false, "Eggs"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Cornflakes"));
        arrIc.add(new IngredientsCheck(false, "Bacon"));
        arrIc.add(new IngredientsCheck(false, "Flour"));
        arrIc.add(new IngredientsCheck(false, "Tomato"));
        arrIc.add(new IngredientsCheck(false, "Cheese"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Salt"));
        arrIc.add(new IngredientsCheck(false, "Sugar"));
        arrIc.add(new IngredientsCheck(false, "Pepper"));
        arrIc.add(new IngredientsCheck(false, "Cucumber"));
        arrIc.add(new IngredientsCheck(false, "Thyme"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));



        lvIngredients=(ListView) findViewById(R.id.lvIngredients);
        adapter2 = new CustomAdapter2(this, R.layout.ingredients, arrIc);
        lvIngredients.setAdapter(adapter2);



    }
}
