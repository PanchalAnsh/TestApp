package com.example.testapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.contentcapture.DataShareRequest;

import com.example.testapp.MainActivity;
import com.example.testapp.MySharedPreference;
import com.example.testapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MySharedPreference mySharedPreference = new MySharedPreference();
                if (mySharedPreference.getFlag(SplashScreenActivity.this)) {
                    startActivity(new Intent(SplashScreenActivity.this, IntrosliderActivity.class));
                } else if (mySharedPreference.getData(SplashScreenActivity.this) == null) {
                    startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashScreenActivity.this, DashBoardActivity.class));
                }


//                MySharedPreference mySharedPreference = new MySharedPreference();
//                if (mySharedPreference.getData(SplashScreenActivity.this) ==  null){
//                    startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
//                } else {
//                    startActivity(new Intent(SplashScreenActivity.this, DashBoardActivity.class));
//                }
                finish();
            }
        }, 3000);

    }
}