package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    //1.properties definition
    EditText editTextEmail, editTextPassword;
    Button buttonLogIn, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //initialize properties
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonLogIn = findViewById(R.id.buttonLogIn);
        buttonLogIn.setOnClickListener(this);

        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main_menu, menu);
        //return true;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //return super.onOptionsItemSelected(item);
        Intent goToNextActivity;

        switch(item.getItemId()){

            case R.id.settings:

                goToNextActivity = new Intent(getApplicationContext(),SettingsActivity.class);
                startActivity(goToNextActivity);
                break;

            case R.id.addrecipe:
                goToNextActivity = new Intent(getApplicationContext(),AddRecipeActivity.class);
                startActivity(goToNextActivity);
                break;

            case R.id.logout:
                goToNextActivity = new Intent(getApplicationContext(),LogInActivity.class);
                startActivity(goToNextActivity);
                break;

        }
        return true;
    }

    @Override
    public void onClick(View view) {
        if(view == buttonLogIn){
            if(editTextPassword.getText().toString().equals("") || editTextEmail.getText().toString().equals(""))
            {
                Toast.makeText(this, "Empty Password or Email", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this, ClockActivity.class);
                i.putExtra("email", editTextEmail.getText().toString());
                i.putExtra("password", editTextPassword.getText().toString());
                startActivity(i);
            }
        }

        else{
            Intent i = new Intent (this, SignUpActivity.class);
            startActivity(i);
        }
    }
}