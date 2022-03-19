package com.example.myplacesapplcation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        findViewById(R.id.appLogoImageView).setOnClickListener(gotoLoginActivity_OnClick);
    }

    private View.OnClickListener gotoLoginActivity_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(LogoActivity.this, LoginActivity.class));
            finish();
        }
    };

}