package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DinnerActivity extends AppCompatActivity {

    android.widget.ListView lvIngredients;
    CustomAdapter2 adapter2;
    ArrayList<IngredientsCheck> arrIc = new ArrayList<IngredientsCheck>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        arrIc.add(new IngredientsCheck(false, ""));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "Milk"));
        arrIc.add(new IngredientsCheck(false, "sa"));


        lvIngredients=(ListView) findViewById(R.id.lvIngredients);
        adapter2 = new CustomAdapter2(this, R.layout.ingredients, arrIc);
        lvIngredients.setAdapter(adapter2);
    }
}
