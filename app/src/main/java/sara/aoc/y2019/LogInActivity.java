package sara.aoc.y2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    //1.properties definition
    EditText editTextEmail, editTextPassword;
    Button buttonLogIn, buttonSignUp;
    TextView textView;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        //initialize properties
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonLogIn = findViewById(R.id.buttonLogIn);
        buttonLogIn.setOnClickListener(this);

       // buttonSignUp = findViewById(R.id.buttonSignUp);
       // buttonSignUp.setOnClickListener(this);

        textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);


    }

    public void logIn(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("FirebaseAuth", "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            //updateUI(user);
                            Intent i = new Intent (LogInActivity.this, MealsActivity.class);
                            startActivity(i);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("FirebaseAuth", "signInWithEmail:failure", task.getException());
                            Toast.makeText(LogInActivity.this, "Authentication failed.",
                                    Toast.LENGTH_LONG).show();
                            //updateUI(null);
                        }

                        // ...
                    }
                });
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
                logIn(editTextEmail.getText().toString(), editTextPassword.getText().toString());

            }
        }

        else{
            Intent i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
    }
}