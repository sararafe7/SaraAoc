package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DinnerActivity extends AppCompatActivity implements View.OnClickListener {

    Button dinnerBtn1, dinnerBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        dinnerBtn1 = findViewById(R.id.dinnerBtn1);
        dinnerBtn1.setOnClickListener(this);


        dinnerBtn2 = findViewById(R.id.dinnerBtn2);
        dinnerBtn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == dinnerBtn1){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            startActivity(i);
        }

        if (view == dinnerBtn2){
            Intent i = new Intent(this, PreparedRecipeActivity.class);
            startActivity(i);
        }
    }
}
