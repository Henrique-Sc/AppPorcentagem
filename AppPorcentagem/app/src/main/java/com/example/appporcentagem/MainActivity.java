package com.example.appporcentagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum;
    Button btn5, btn10, btn15, btn35;

    int num;
    Double porcent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum = findViewById(R.id.edtNum);

        btn5 = findViewById(R.id.btn5);
        btn10 = findViewById(R.id.btn10);
        btn15 = findViewById(R.id.btn15);
        btn35 = findViewById(R.id.btn35);

        btn5.setOnClickListener(view -> {
            num = Integer.parseInt(edtNum.getText().toString());
            porcent = num * 0.05;

            Toast.makeText(this, "Porcentagem: " + porcent + "%", Toast.LENGTH_SHORT).show();
        });
        
        btn10.setOnClickListener(view -> {
           num = Integer.parseInt(edtNum.getText().toString());
           porcent = num * 0.10;

           Toast.makeText(this, "Porcentagem: " + porcent + "%", Toast.LENGTH_SHORT).show();
        });

        btn15.setOnClickListener(view -> {
            num = Integer.parseInt(edtNum.getText().toString());
            porcent = num * 0.15;

            Toast.makeText(this, "Porcentagem: " + porcent + "%", Toast.LENGTH_SHORT).show();
        });

        btn35.setOnClickListener(view -> {
            num = Integer.parseInt(edtNum.getText().toString());
            porcent = num * 0.35;

            Toast.makeText(this, "Porcentagem: " + porcent + "%", Toast.LENGTH_SHORT).show();
        });
    }
}