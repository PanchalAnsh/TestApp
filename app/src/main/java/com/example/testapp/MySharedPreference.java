package com.example.testapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.testapp.Activities.SplashScreenActivity;

public class MySharedPreference {
    private static final String PREF_USER = "User";
    private static final String PREF_USERNAME = "Username";

    public MySharedPreference(){
        super();
    }

    public void saveData(Context context,String username){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PREF_USERNAME,username);
        editor.apply();
    }

    public String getData(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_USER,Context.MODE_PRIVATE);
        return sharedPreferences.getString(PREF_USERNAME,null);
    }

    public void logoutData(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(PREF_USERNAME);
        editor.clear();
        editor.apply();
        Intent intent = new Intent(context, SplashScreenActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }
}
