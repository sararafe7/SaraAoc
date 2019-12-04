package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IngredientsListActivity extends AppCompatActivity {

    ExpandableListView expandableListViewIng;
    List<String> listCategories;
    HashMap<String,List<String>> listIngCheck;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients_list);

        expandableListViewIng = findViewById(R.id.expandableListViewIng);
        listCategories = new ArrayList<>();
        listIngCheck = new HashMap<>();
        initListData();
    }

    private void initListData() {
        listCategories.add(getString(R.string.Category1));
        listCategories.add(getString(R.string.Category2));
        listCategories.add(getString(R.string.Category3));
        listCategories.add(getString(R.string.Category4));
        listCategories.add(getString(R.string.Category5));
        listCategories.add(getString(R.string.Category6));
        listCategories.add(getString(R.string.Category7));
        listCategories.add(getString(R.string.Category8));
        listCategories.add(getString(R.string.Category9));
        listCategories.add(getString(R.string.Category10));

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

        listIngCheck.put(listCategories.get(0), list1);
        listIngCheck.put(listCategories.get(1), list2);
        listIngCheck.put(listCategories.get(2), list3);
        listIngCheck.put(listCategories.get(3), list4);
        listIngCheck.put(listCategories.get(4), list5);
        listIngCheck.put(listCategories.get(5), list6);
        listIngCheck.put(listCategories.get(6), list7);
        listIngCheck.put(listCategories.get(7), list8);
        listIngCheck.put(listCategories.get(8), list9);
        listIngCheck.put(listCategories.get(9), list10);
    }
}
