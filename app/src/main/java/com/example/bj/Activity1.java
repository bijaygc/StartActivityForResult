package com.example.bj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
   private Button button;
   private EditText eTData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);


        button = findViewById(R.id.btn2);
        eTData =  findViewById(R.id.eTData);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("returnData", eTData.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
