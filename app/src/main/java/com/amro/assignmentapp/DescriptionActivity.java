package com.amro.assignmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionActivity extends AppCompatActivity {
    public static final String DESCRIPTION = "description";
    public static final String TITLE = "title";
    private TextView title;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_activity);

        title = findViewById(R.id.txtTitle);
        description = findViewById(R.id.txtDescription);

        Intent intent = getIntent();
        String descriptionExtra = intent.getStringExtra(DESCRIPTION);
        String titleExtra = intent.getStringExtra(TITLE);

        title.setText(titleExtra);
        description.setText(descriptionExtra);
    }

}