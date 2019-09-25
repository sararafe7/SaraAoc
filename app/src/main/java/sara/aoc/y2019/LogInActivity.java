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

    //1.properties defenition
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
        buttonSignUp = findViewById(R.id.buttonSignUp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main_menu, menu);
        //return true;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View view) {
        if(view == buttonLogIn){
            if(editTextPassword.getText().toString().equals("") || editTextEmail.getText().toString().equals(""))
            {
                Toast.makeText(this, "Empty Password or Email", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this, MainActivity.class);
                i.putExtra("email", editTextEmail.getText().toString());
                i.putExtra("password", editTextPassword.getText().toString());
                startActivity(i);
            }
        }

        else{
            Intent i = new Intent (this, ClockActivity.class);
            startActivity(i);
        }
    }
}