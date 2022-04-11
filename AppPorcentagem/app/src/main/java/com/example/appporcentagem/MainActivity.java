package com.example.appporcentagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNum;
    Button btn5, btn10, btn15, btn35;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum = findViewById(R.id.edtNum);

        btn5 = findViewById(R.id.btn5);
        btn10 = findViewById(R.id.btn10);
        btn15 = findViewById(R.id.btn15);
        btn35 = findViewById(R.id.btn35);
    }
}