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
//        if (MealName() != null) {
        builder.setMessage("Since It Is " + HourMinute() + ", Would You Like to See The"
                + MealName() + " Ingredients?");
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
//    }

    public static String HourMinute() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);

        if (cal.get(Calendar.AM_PM) != 0) {
            if (minute < 10) {
                return hour + 12 + ":" + "0" + minute;
            } else {
                return 12 + hour + ":" + minute;
            }
        }
        if (hour == 12){
            if (minute < 10)
                return "00" + "0" + minute;
            return "00" + minute;
        }
        if (hour > 9) {
            if (minute < 10) {
                return hour + ":" + "0" + minute;
            }
        }
        else{
            if(minute<10){
                return"0"+ hour + ":" + "0" + minute;
            }
        }
        return "0" + hour + ":" + minute;
    }
    public static String MealName() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);

        if (cal.get(Calendar.AM_PM) == 0) {
            if (hour > 4 && hour < 12)
                return " Breakfast";
        } else {
            if (hour == 0 || (hour>=1 && hour <6))
                return " Lunch";
            if (hour > 5 && hour < 12)
                return " Dinner";

        }
        return null;
    }
}



