package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AllRecipesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipes);

        addBtn = findViewById(R.id.addBtn);
    }
    @Override
    public void onClick(View View){
        if(View == addBtn){
            Intent intent = new Intent(AllRecipesActivity.this, AddRecipeActivity.class);
            startActivity(intent);
        }
            }
}
