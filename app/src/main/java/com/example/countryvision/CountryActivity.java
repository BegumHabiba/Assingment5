package com.example.countryvision;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CountryActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        recyclerView = findViewById(R.id.recyclerView);

        // Country names
        String[] countryNames = getResources().getStringArray(R.array.country_names);

        // Flag images
        Integer[] flagImages = {
                R.drawable.img_4, R.drawable.img_14, R.drawable.img_3,
                R.drawable.img_2, R.drawable.img_1, R.drawable.img_13,
                R.drawable.img_15, R.drawable.img, R.drawable.img_7,
                R.drawable.img_8, R.drawable.img_11, R.drawable.img_9,
                R.drawable.img_10, R.drawable.img_12, R.drawable.img_5,
                R.drawable.img_6
        };

        // Set up RecyclerView
        CountryAdapter adapter = new CountryAdapter(this, countryNames, flagImages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}