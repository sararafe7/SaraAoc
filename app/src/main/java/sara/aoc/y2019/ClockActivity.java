package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class ClockActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock2);

        GetCurrentDateTime();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptionsItemSelected(MenuItem item) {
      //  Intent goToNextActivity = new Intent(getApplicationContext(), ClockActivity.class);

        return true;
    }

    public static Date GetCurrentDateTime() {
        Date currentTime = Calendar.getInstance().getTime();
        Log.d("Time", currentTime.toString());

        return currentTime;
    }

}
