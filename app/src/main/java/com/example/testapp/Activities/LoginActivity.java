package com.example.testapp.Activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.testapp.MainActivity;
import com.example.testapp.MySharedPreference;
import com.example.testapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout txtInLayoutUsername;
    TextInputLayout txtInLayoutPassword;

    TextInputEditText edtUsername;
    TextInputEditText edtPassword;

    AppCompatButton btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtInLayoutUsername=findViewById(R.id.txtInputLayoutUsername);
        txtInLayoutPassword=findViewById(R.id.txtInLayoutPassword);

        edtUsername=findViewById(R.id.edtusername);
        edtPassword=findViewById(R.id.edtpassword);

        btnLogin=findViewById(R.id.btnlogin);

        edtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String Username = edtUsername.getText().toString();
                if (Username.equals("admin")) {
                    txtInLayoutUsername.setError(null);
                    txtInLayoutUsername.setHelperText("Correct Username");
                } else {
                    txtInLayoutUsername.setError("Username not found");
                    txtInLayoutUsername.setHelperText(null);
                }
            }
        });



        edtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String password = edtPassword.getText().toString();
                if (password.equals("admin")) {
                    txtInLayoutPassword.setError(null);
                    txtInLayoutPassword.setHelperText("Correct password");
                } else {
                    txtInLayoutPassword.setError("Password is invalid");
                    txtInLayoutPassword.setHelperText(null);
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();

                if (username.isEmpty()) {
                    txtInLayoutUsername.setError("Username is Empty");
                } else if (password.isEmpty()) {
                    txtInLayoutPassword.setError("Password Fiels is Empty");
                } else if (!username.equals("admin")) {
                    txtInLayoutUsername.setError("Username is not valid");
                } else if (!password.equals("admin")) {
                    txtInLayoutPassword.setError("Password is not valid");
                } else if (username.equals("admin") && password.equals("admin")) {

                    MySharedPreference mySharedPreference = new MySharedPreference();
                    mySharedPreference.saveData(LoginActivity.this,username);

                    Intent i = new Intent(LoginActivity.this, DashBoardActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Clickable", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}

