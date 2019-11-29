package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;

public class IngredientsListActivity extends AppCompatActivity {

    ExpandableListView expandableListViewIng;
    List<String> listGroup;
    HashMap<String,List<String>>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients_list);

        expandableListViewIng = findViewById(R.id.expandableListViewIng);
        
    }
}
