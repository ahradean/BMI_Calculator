package com.example.bmi_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Calculate extends AppCompatActivity{
    MainActivity y = new MainActivity();
    protected int w = Integer.parseInt(y.we);
    protected int h = Integer.parseInt(y.he);

    public Double getCaluulate(){
        double changeH = h/100;
        double calBMI = w/(changeH*changeH);

        return calBMI;
    }

    public String levelBMI() {
        if (getCaluulate() < 18.5) {
            return "น้ำหนักน้อยกว่าปกติ(ผอม)";
        } else if (getCaluulate() >= 18.5 && getCaluulate() < 25) {
            return "น้ำหนักปกติ";
        } else if (getCaluulate() >= 25 && getCaluulate() < 30) {
            return "น้ำหนักมากกว่าปกติ(ท้วม)";
        } else if (getCaluulate() > 30){
            return "น้ำหนักมากกว่าปกติมาก(อ้วน)";
        }
        else return "error";

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String textView1 = intent.getStringExtra("text1");
        String BMI = intent.getStringExtra("cal");
        String textView2 = intent.getStringExtra("text2");
        String Level = intent.getStringExtra("level");


        TextView titleTextView = (TextView) findViewById(R.id.title_view_text);
        titleTextView.setText(textView1);

        TextView BMIValue = (TextView) findViewById(R.id.bottun_bmi);
        BMIValue.setText(BMI);

        TextView TextLevel = (TextView) findViewById(R.id.title_level);
        TextLevel.setText(textView2);

        TextView LevelValue = (TextView) findViewById(R.id.bottun_level);
        LevelValue.setText(Level);





    }



}
