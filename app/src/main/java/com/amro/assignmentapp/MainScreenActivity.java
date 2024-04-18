package com.amro.assignmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.amro.assignmentapp.model.MenuItem;
import com.amro.assignmentapp.model.TenseItems;

import java.util.List;

public class MainScreenActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainscreen);
        Intent intent = getIntent();

        TextView textName = findViewById(R.id.txtName);
        String name = intent.getStringExtra("data");
        textName.setText(String.format("Welcome %s", name));
        setupViews();
        populateSpinner();


        list.setOnItemClickListener((parent, view, position, id) -> {
            openDescription(parent, position);
        });

    }

    private void openDescription(AdapterView<?> parent, int position) {
        MenuItem selectedItem = (MenuItem) parent.getItemAtPosition(position);

        if (selectedItem == null) {
            return;
        }

        Intent intent1 = new Intent(MainScreenActivity.this, DescriptionActivity.class);
        intent1.putExtra(DescriptionActivity.DESCRIPTION, selectedItem.description());
        intent1.putExtra(DescriptionActivity.TITLE, selectedItem.name());
        startActivity(intent1);
    }

    private void populateSpinner() {
        TenseItems db = new TenseItems();
        String[] cats = db.getCategories();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cats);
        spinner.setAdapter(adapter);
    }

    private void setupViews() {
        spinner = findViewById(R.id.spinner);
        list = findViewById(R.id.list);
    }

    public void btnSearchOnClick(View view) {
        TenseItems db = new TenseItems();
        String cat = spinner.getSelectedItem().toString();

        List<MenuItem> result = db.getMenuItems(cat);
        MenuItem[] arr = result.toArray(new MenuItem[0]);
        ArrayAdapter<MenuItem> adapter = new ArrayAdapter<>(MainScreenActivity.this,
                android.R.layout.simple_list_item_1, arr);
        list.setAdapter(adapter);
    }
}