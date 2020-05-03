package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperimentActivity extends AppCompatActivity {

    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);

        lv = (ListView) findViewById(R.id.experimentLv);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).

        List<String> exper_array_list = new ArrayList<String>(Arrays.asList("ALI", "L5mi7u, "));

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                exper_array_list);

//        lv.setAdapter(arrayAdapter);
    }
}
