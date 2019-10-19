package com.example.todosampleapp.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.todosampleapp.R;

import butterknife.BindView;

public class SignupActivity extends AppCompatActivity {

    @BindView(R.id.editEmail)
    AppCompatEditText etEmail;

    @BindView(R.id.editUserName)
    AppCompatEditText etUserName;

    @BindView(R.id.editPassword)
    AppCompatEditText etPassword;

    @BindView(R.id.editPasswordConfirm)
    AppCompatEditText etPasswordConfirm;

    @BindView(R.id.btnSignUp)
    AppCompatButton btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
}
