package com.example.myplacesapplcation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    LinearLayout login_section, register_section;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_section = findViewById(R.id.login_section);
        register_section = findViewById(R.id.register_section);

        login_section.findViewById(R.id.cirLoginButton).setOnClickListener(login_OnClick);
        login_section.findViewById(R.id.textViewSignUp).setOnClickListener(showRegisterSection);
        register_section.findViewById(R.id.cirLoginButton).setOnClickListener(register_OnClick);
        register_section.findViewById(R.id.textViewlogin).setOnClickListener(showLoginSection);

        login_section.setVisibility(View.VISIBLE);
    }

    private View.OnClickListener showLoginSection = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            login_section.setVisibility(View.VISIBLE);
            register_section.setVisibility(View.GONE);
        }
    };

    private View.OnClickListener showRegisterSection = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            login_section.setVisibility(View.GONE);
            register_section.setVisibility(View.VISIBLE);
        }
    };

    private View.OnClickListener login_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(LoginActivity.this, "existing user login . . .", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(LoginActivity.this, MapActivity.class));
        }
    };

    private View.OnClickListener register_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(LoginActivity.this, "new user registeration . . .", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(LoginActivity.this, MapActivity.class));
        }
    };
}