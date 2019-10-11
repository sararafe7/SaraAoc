package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MealsActivity extends AppCompatActivity {

    @Override
    private Button btnOption;
   // private void EvantHandler(){
       // btnOption.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
            //    AlertDialog.Builder builder = new AlertDialog.Builder(MealsActivity.this);
              //  builder.setMessage("Since It Is *hour*, Would You Like to See The *meal* Ingredients?")
                //        .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                  //  @Override
                    //public void onClick(DialogInterface dialogInterface, int which) {
                      //  MealsActivity
                    //}
                //});

            //}
       // });
    //}
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);
       // private void EvantHandler() {
         //   btnOption.setOnClickListener(new View.OnClickListener() {
           //     @Override
             //   public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MealsActivity.this);
                    builder= builder.setMessage("Since It Is *hour*, Would You Like to See The *meal* Ingredients?")
                .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent i = new Intent(this, BreakfastActivity);

                    })
                            .setNegative
                });

    }
          //  });
        //}
        

    }
}
