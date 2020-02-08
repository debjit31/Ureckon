package com.rup.ureckon;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.location.LocationManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    //ProgressBar progressBar;
    EditText editTextName,editTextCollege,editTextEmail, editTextPassword;
    LocationManager locationManager;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextName = (EditText) findViewById(R.id.editTextName2);
        editTextCollege = (EditText) findViewById(R.id.editTextCollege2);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail2);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword2);
       // progressBar = (ProgressBar) findViewById(R.id.progressbar);

        mAuth = FirebaseAuth.getInstance();


        findViewById(R.id.buttonLogin).setOnClickListener(this);
         findViewById(R.id.login_text).setOnClickListener(this);
    }



    private void registerUser() {
        final String name = editTextName.getText().toString().trim();
        final String college = editTextCollege.getText().toString().trim();
        final String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (name.isEmpty()) {
            editTextEmail.setError("Name is required");
            editTextEmail.requestFocus();
            return;
        }

        if (college.isEmpty()) {
            editTextEmail.setError("Institution's name is required");
            editTextEmail.requestFocus();
            return;
        }


        if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Please enter a valid email");
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError("Minimum lenght of password should be 6");
            editTextPassword.requestFocus();
            return;
        }

       // progressBar.setVisibility(View.VISIBLE);
        final ProgressDialog loading = ProgressDialog.show(this,"Authenticating","Please wait");

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
               // progressBar.setVisibility(View.GONE);
                loading.dismiss();
                if (task.isSuccessful()) {
                    finish();

                    Intent intent= new Intent(SignUpActivity.this, MainActivity2.class);

                    intent.putExtra("name",name);
                    intent.putExtra("college",college);
                    intent.putExtra("email",email);

                    startActivity(intent);
                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonLogin:
                registerUser();
                break;

            case R.id.login_text:
                finish();
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


}