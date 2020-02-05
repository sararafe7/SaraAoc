package sara.aoc.y2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    EditText editTextEmail, editTextPassword, editTextConfirmPassword;
    Button buttonSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextEmail = findViewById(R.id.etEmail);
        editTextPassword = findViewById(R.id.etPassword);
        editTextConfirmPassword = findViewById((R.id.etConPassword));

        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);


        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

    }
    @Override
    public void onClick(View View){
        if(View == buttonSignUp)
            signUp(editTextEmail.getText().toString(), editTextPassword.getText().toString());
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        // updateUI(currentUser);
    }

    public void signUp (String email, String password){

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (editTextPassword.equals(editTextConfirmPassword)) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d("FirebaseAuth", "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Toast.makeText(SignUpActivity.this, user.getEmail(), Toast.LENGTH_LONG).show();
                             //   Toast.makeText(SignUpActivity.this, email+":"+password, Toast.LENGTH_LONG).show();


                                //updateUI(user);
                                Intent i = new Intent(SignUpActivity.this, MealsActivity.class);
                                startActivity(i);
                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(SignUpActivity.this, "FAILED", Toast.LENGTH_LONG).show();

                                Log.w("FirebaseAuth", "createUserWithEmail:failure", task.getException());
                                Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                //updateUI(null);
                            }
                        }
                        else
                            Toast.makeText(SignUpActivity.this, "Different Passwords.",
                                    Toast.LENGTH_SHORT).show();

                        // ...
                    }
                });
    }
}
