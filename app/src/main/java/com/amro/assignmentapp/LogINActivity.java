package com.amro.assignmentapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class LogINActivity extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String PASSWORD = "PASSWORD";
    public static final String FLAG = "FLAG";
    private EditText edtName;
    private EditText edtPassword;
    private CheckBox chk;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
        setupSharedPrefs();
        checkPrefs();

    }

    private void setupViews() {
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPasswd);
        chk = findViewById(R.id.checkBox);
    }

    private void setupSharedPrefs() {
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }

    private void checkPrefs() {
        boolean flag = prefs.getBoolean(FLAG, false);
        if (flag) {
            String name = prefs.getString(NAME, "");
            String password = prefs.getString(PASSWORD, "");
            edtName.setText(name);
            edtPassword.setText(password);
            chk.setChecked(true);
        }
    }


    public void btnSLogInOnClick(View view) {
        String name = edtName.getText().toString();
        String password = edtPassword.getText().toString();

        if (chk.isChecked()) {
            editor.putString(NAME, name);
            editor.putString(PASSWORD, password);
            editor.putBoolean(FLAG, true);
            editor.commit();
        }
        Intent intent = new Intent(this, MainScreenActivity.class);
        intent.putExtra("data", name);
        startActivity(intent);
    }
}











