package com.example.testapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testapp.Adapter.IntroPageAdapter;
import com.example.testapp.Fragment.IntroFragment_1;
import com.example.testapp.Fragment.IntroFragment_2;
import com.example.testapp.Fragment.IntroFragment_3;
import com.example.testapp.MySharedPreference;
import com.example.testapp.R;

import java.util.ArrayList;

public class IntrosliderActivity extends AppCompatActivity {

    Button btnNext;
    TextView textSkip;
    ImageView iv1,iv2,iv3;
    ViewPager viewPager;
    int item=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introslider);

        btnNext = findViewById(R.id.btnNext);
        textSkip = findViewById(R.id.txtSkip);
        viewPager = findViewById(R.id.introviewpager);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);

        MySharedPreference mySharedPreference = new MySharedPreference();
        mySharedPreference.setFlag(IntrosliderActivity.this,false);

        IntroPageAdapter pageAdapter = new IntroPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        iv1.setBackground(getDrawable(R.drawable.active_dot));
        iv2.setBackground(getDrawable(R.drawable.non_active_dot));
        iv3.setBackground(getDrawable(R.drawable.non_active_dot));

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item++;
                switch (item){
                    case 1:
                        iv1.setBackground(getDrawable(R.drawable.non_active_dot));
                        iv2.setBackground(getDrawable(R.drawable.active_dot));
                        iv3.setBackground(getDrawable(R.drawable.non_active_dot));
                        break;
                    case 2:
                        iv1.setBackground(getDrawable(R.drawable.non_active_dot));
                        iv2.setBackground(getDrawable(R.drawable.non_active_dot));
                        iv3.setBackground(getDrawable(R.drawable.active_dot));
                        btnNext.setText("Start");
                        break;
                    case 3:
                        Intent intent = new Intent(IntrosliderActivity.this,LoginActivity.class);
                        startActivity(intent);
                        break;
                }
                viewPager.setCurrentItem(item);
            }
        });

        textSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntrosliderActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}