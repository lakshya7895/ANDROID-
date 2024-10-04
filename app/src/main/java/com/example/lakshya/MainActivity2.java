package com.example.lakshya;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt = findViewById(R.id.txt);
        Intent intent = getIntent();
        String received = intent.getStringExtra("data");
        txt.setText("Hello : "+received);
    } }