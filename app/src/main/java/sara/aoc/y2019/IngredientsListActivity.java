package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IngredientsListActivity extends AppCompatActivity implements View.OnClickListener {

    ExpandableListView expandableListViewIng;
    List<String> listCategory;
    HashMap<String,List<String>> listIngCheck;
    MainAdapter adapter;
    CheckedTextView chtvDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients_list);

        chtvDone=findViewById(R.id.chtvDone);
        chtvDone.setOnClickListener(this);

        expandableListViewIng = findViewById(R.id.expandableListViewIng);
        listCategory = new ArrayList<>();
        listIngCheck = new HashMap<>();
        adapter = new MainAdapter(this, listCategory, listIngCheck);
        expandableListViewIng.setAdapter(adapter);
        initListData();
    }

    private void initListData() {
        listCategory.add(getString(R.string.Category1));
        listCategory.add(getString(R.string.Category2));
        listCategory.add(getString(R.string.Category3));
        listCategory.add(getString(R.string.Category4));
        listCategory.add(getString(R.string.Category5));
        listCategory.add(getString(R.string.Category6));
        listCategory.add(getString(R.string.Category7));
        listCategory.add(getString(R.string.Category8));
        listCategory.add(getString(R.string.Category9));
        listCategory.add(getString(R.string.Category10));

        String[] array;

        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category1);
        for (String ingredientCheck : array)
            list1.add(ingredientCheck);

        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category2);
        for (String ingredientCheck : array)
            list2.add(ingredientCheck);

        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category3);
        for (String ingredientCheck : array)
            list3.add(ingredientCheck);

        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category4);
        for (String ingredientCheck : array)
            list4.add(ingredientCheck);

        List<String> list5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category5);
        for (String ingredientCheck : array)
            list5.add(ingredientCheck);

        List<String> list6 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category6);
        for (String ingredientCheck : array)
            list6.add(ingredientCheck);

        List<String> list7 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category7);
        for (String ingredientCheck : array)
            list7.add(ingredientCheck);

        List<String> list8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category8);
        for (String ingredientCheck : array)
            list8.add(ingredientCheck);

        List<String> list9 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category9);
        for (String ingredientCheck : array)
            list9.add(ingredientCheck);

        List<String> list10 = new ArrayList<>();
        array = getResources().getStringArray(R.array.Category10);
        for (String ingredientCheck : array)
            list10.add(ingredientCheck);

        listIngCheck.put(listCategory.get(0), list1);
        listIngCheck.put(listCategory.get(1), list2);
        listIngCheck.put(listCategory.get(2), list3);
        listIngCheck.put(listCategory.get(3), list4);
        listIngCheck.put(listCategory.get(4), list5);
        listIngCheck.put(listCategory.get(5), list6);
        listIngCheck.put(listCategory.get(6), list7);
        listIngCheck.put(listCategory.get(7), list8);
        listIngCheck.put(listCategory.get(8), list9);
        listIngCheck.put(listCategory.get(9), list10);
        adapter.notifyDataSetChanged();
    }

    public void onClick (View view){
        if(view==chtvDone) {
            Intent i = new Intent(this, RecipeActivity.class);
            startActivity(i);
        }
    }
}
