package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

import sara.aoc.y2019.BreakfastActivity;
import sara.aoc.y2019.R;

public class MealsActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnBreakfast, btnLunch, btnDinner, btnVegan, btnSweets, btnSnacks, btnIngCheck;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        btnBreakfast = findViewById(R.id.btnBreakfast);
        btnBreakfast.setOnClickListener(this);
        btnLunch = findViewById(R.id.btnLunch);
        btnLunch.setOnClickListener(this);
        btnDinner = findViewById(R.id.btnDinner);
        btnDinner.setOnClickListener(this);
        btnVegan = findViewById(R.id.btnVegan);
        btnVegan.setOnClickListener(this);
        btnSweets = findViewById(R.id.btnSweets);
        btnSweets.setOnClickListener(this);
        btnSnacks = findViewById(R.id.btnSnacks);
        btnSnacks.setOnClickListener(this);
        btnIngCheck = findViewById(R.id.btnIngCheck);
        btnIngCheck.setOnClickListener(this);

        AlertDialog.Builder builder = new AlertDialog.Builder(MealsActivity.this);
//        if (MealName() != null) {
        builder.setMessage("Since It Is " + HourMinute() + ", Would You Like to See The"
                + MealName() + " Ingredients?");
        builder.setCancelable(false);
        builder.setNegativeButton("I Have Something Else in mind", null);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (MealName().equals("Breakfast")) {
                    Intent intent = new Intent(MealsActivity.this, BreakfastActivity.class);
                    startActivity(intent);
                }
                if (MealName().equals("Lunch")) {
                    Intent intent = new Intent(MealsActivity.this, LunchActivity.class);
                    startActivity(intent);
                }
                if (MealName().equals("Dinner")) {
                    Intent intent = new Intent(MealsActivity.this, DinnerActivity.class);
                    startActivity(intent);
                }
                if (MealName().equals("Vegan")) {
                    Intent intent = new Intent(MealsActivity.this, VeganActivity.class);
                    startActivity(intent);
                }
                if (MealName().equals("Sweets")) {
                    Intent intent = new Intent(MealsActivity.this, SweetsActivity.class);
                    startActivity(intent);
                }
                if (MealName().equals("Snacks")){
                    Intent intent = new Intent(MealsActivity.this, SnacksActivity.class);
                    startActivity(intent);
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

}

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

    @Override
    public void onClick(View view) {
        if(view == btnBreakfast){
            Intent i = new Intent(this, BreakfastActivity.class);
            startActivity(i);
        }
        if(view == btnLunch){
            Intent i = new Intent(this, LunchActivity.class);
            startActivity(i);
        }
        if(view == btnDinner){
            Intent i = new Intent(this, DinnerActivity.class);
            startActivity(i);
        }
        if(view == btnVegan){
            Intent i = new Intent(this, VeganActivity.class);
            startActivity(i);
        }
        if(view == btnSweets){
            Intent i = new Intent(this, SweetsActivity.class);
            startActivity(i);
        }
        if(view == btnSnacks){
            Intent i = new Intent(this, SnacksActivity.class);
            startActivity(i);
        }
        if(view == btnIngCheck){
            Intent i = new Intent(this, IngredientsListActivity.class);
            startActivity(i);
        }
    }
}



