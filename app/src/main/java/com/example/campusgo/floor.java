package com.example.campusgo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class floor extends AppCompatActivity {
    Button groundFloorButton, secondFloorButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor);

        groundFloorButton = findViewById(R.id.GroundFloor);
        secondFloorButton = findViewById(R.id.SecondFloor);
        backButton =  findViewById(R.id.backBtn);

        groundFloorButton.setOnClickListener(v -> {
            Intent intent = new Intent(floor.this, ImageViewerActivity.class);
            intent.putExtra("imageResId", R.drawable.ground); // Replace "ground" with the actual drawable name
            startActivity(intent);
        });

        secondFloorButton.setOnClickListener(v -> {
            Intent intent = new Intent(floor.this, ImageViewerActivity.class);
            intent.putExtra("imageResId", R.drawable.second_floor); // Replace "second" with the actual drawable name
            startActivity(intent);
        });

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(floor.this, home_activity.class);
            startActivity(intent);
        });
    }
}
