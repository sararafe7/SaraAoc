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


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        AlertDialog.Builder builder = new AlertDialog.Builder(MealsActivity.this);
        builder.setMessage("Since It Is "+ HourMinute()+", Would You Like to See The *meal* Ingredients?");
        builder.setCancelable(false);
        builder.setNegativeButton("I Have Something Else in mind", null);
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
        public static String HourMinute (){
            Calendar cal = Calendar.getInstance();
            int month = cal.get(Calendar.MONTH);
            int hour = cal.get(Calendar.HOUR);
            int minute = cal.get(Calendar.MINUTE);
            if(month>=6&&month<11) {
                if (minute < 10)
                    return (hour + 3) + ":" + "0" + minute;
                return (hour + 3) + ":" + minute;
            }

            if(month==11 && month==12|| month>1&&month<6) {
                if (minute < 10)
                    return (hour + 2) + ":" + "0" + minute;
                return (hour + 2) + ":" + minute;
            }
            return null;
        }
    }
