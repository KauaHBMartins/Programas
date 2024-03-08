package com.contaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edMin, edMax;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edMin = findViewById(R.id.editTextMin);
        edMax = findViewById(R.id.editTextMax);
        textViewResult = findViewById(R.id.textView);
    }

    public  void randNumber(View v){
        int max, min;
        min = integer.parseInt(edMin.getText().toString());
        max = integer.perseInt(edMax.getText().toString());
        Random R = new Random();
        r.nextInt(bound.max-min+1);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
}