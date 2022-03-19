package com.example.myplacesapplcation;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Calendar;

public class LogoActivity extends AppCompatActivity {
    public static String TAG = "LogoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        findViewById(R.id.appLogoImageView).setOnClickListener(gotoLoginActivity_OnClick);


        FirebaseAuth.getInstance().signOut();
    }

    private View.OnClickListener gotoLoginActivity_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(LogoActivity.this, LoginActivity.class));
            finish();
        }
    };

}