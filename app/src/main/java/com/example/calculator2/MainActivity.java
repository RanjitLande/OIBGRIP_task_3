package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1,e2;
        Button b1,b2,b3,b4;
        TextView t1;

        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        t1=findViewById(R.id.editTextTextPersonName);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a + b;
                    t1.setText(String.valueOf(c));
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a - b;
                    t1.setText(String.valueOf(c));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a * b;
                    t1.setText(String.valueOf(c));
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a / b;
                    t1.setText(String.valueOf(c));
                }
            }
        });

    }
}