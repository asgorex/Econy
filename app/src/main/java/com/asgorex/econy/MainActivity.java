package com.asgorex.econy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textValue = findViewById(R.id.number_value);
                String number = textValue.getText().toString();
                int originalValue = Integer.parseInt(number);
                int newValue = MyWorker.doubleTheValue(originalValue);
                textValue.setText(Integer.toString(newValue));
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, Integer.toString(newValue), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
