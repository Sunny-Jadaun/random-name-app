package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=(TextView)findViewById(R.id.textView1);
        final Button button1 =  (Button)findViewById(R.id.mybutton);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String[] names = getResources().getStringArray(R.array.name);
                Random rand = new Random();
                int  n = rand.nextInt(names.length-1);
                textView.setText(names[n]);

            }         });

    }
}