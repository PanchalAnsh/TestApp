package com.example.testapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.testapp.Fragment.IntroFragment_1;
import com.example.testapp.Fragment.IntroFragment_2;
import com.example.testapp.Fragment.IntroFragment_3;

public class IntroPageAdapter extends FragmentPagerAdapter {
    public IntroPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new IntroFragment_1();
            case 1: return new IntroFragment_2();
            case 2: return new IntroFragment_3();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
