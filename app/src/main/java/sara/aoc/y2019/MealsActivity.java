package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;

public class MealsActivity extends AppCompatActivity {

    private Button btnOption;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        AlertDialog.Builder builder = new AlertDialog.Builder(MealsActivity.this);
        builder.setMessage("Since It Is"+ HourMinute()+", Would You Like to See The *meal* Ingredients?");
        builder.setCancelable(false);
        builder.setNegativeButton("Something Else in mind", null);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent i = new Intent(MealsActivity.this, BreakfastActivity.class);
                        startActivity(i);
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
        public static void HourMinute (){
            Calendar cal = Calendar.getInstance();
            cal.get(Calendar.HOUR);
            cal.get(Calendar.MINUTE);

        }
    }
