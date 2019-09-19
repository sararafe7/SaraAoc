package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    public void onClick(View view) {
        if(view == buttonLogIn){
            if(editTextPassword.getText().toString().equals("") || editTextEmail.getText().toString().equals(""))
            {
                Toast.makeText(context: this, text: "Empty Password or Email", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = mew Intent(PackageContext: this, MainActivity.class);
                i.putExtra(name: "email", editTextEmail.getText().toString());
                i.putExtra(name: "password", editTextPassword.getText().toString());
                startActivity(i);
            }
        }

        else{
            Intent i = new Intent (this, ClockActivity.class);
            startActivity(i);
        }
    }
}