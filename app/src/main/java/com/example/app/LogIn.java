package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class LogIn extends AppCompatActivity {
    EditText mUserName,mPassword;
    Button mLogIn;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        mUserName = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        mLogIn = findViewById(R.id.loginbutton);

        fAuth = FirebaseAuth.getInstance();
        mLogIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick( View v ) {
                String username = mUserName.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

            }
        });
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }
}
