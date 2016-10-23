package com.example.bmi_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Calculate c = new Calculate();
    EditText text_1 = (EditText)findViewById(R.id.weight);
    EditText text_2 = (EditText)findViewById(R.id.height);
    String we = String.valueOf(text_1);
    String he = String.valueOf(text_2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button_cal);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculate.class);
                intent.putExtra("text1","ค่าดัชนีมวลกาย(BMI):");
                intent.putExtra("cal",c.getCaluulate());
                intent.putExtra("text2","อยู่ในเกณฑ์:");
                intent.putExtra("level",c.levelBMI());
                startActivity(intent);
            }
        });


    }
    public void onClick(View v){

        String weight = text_1.getText().toString();
        String height = text_2.getText().toString();




    }


}
