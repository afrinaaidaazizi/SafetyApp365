package com.example.safetyapp365;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cv1, cv2, cv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = findViewById(R.id.card1);
        cv2 = findViewById(R.id.card2);
        cv7 = findViewById(R.id.card7);

        cv1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AddContacts.class)));

        cv2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, emergency.class)));

        cv7.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FakeCall.class)));

    }

}