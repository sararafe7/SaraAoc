package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SweetsActivity extends AppCompatActivity implements View.OnClickListener{
    Button sweetsBtn1, sweetsBtn2;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweets);

            sweetsBtn1 = findViewById(R.id.sweetsBtn1);
            sweetsBtn1.setOnClickListener(this);

            sweetsBtn2 = findViewById(R.id.sweetsBtn2);
            sweetsBtn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == sweetsBtn1){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            startActivity(i);
        }

        if (view == sweetsBtn2){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            startActivity(i);
        }
    }

}
