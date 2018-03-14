package com.example.jesse.quicksum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sumText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private double sumNum;
    private boolean trigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumText = (TextView) findViewById(R.id.sum_text);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        sumNum = 0.0;
        sumText.setText(String.valueOf(sumNum));
        trigger = false;

    }

    public void add1(View view) {
        if (trigger) {
            sumNum += 0.5;
            sumText.setText(String.valueOf(sumNum));
            trigger = false;
            changebuttonfrom();
        } else {
            sumNum += 1;
            sumText.setText(String.valueOf(sumNum));
        }
    }

    public void add2(View view) {
        if (trigger) {

            sumNum += 0.33;
            sumText.setText(String.valueOf(sumNum));
            trigger = false;
            changebuttonfrom();
        } else {
            sumNum += 2;
            sumText.setText(String.valueOf(sumNum));
        }
    }


    public void add3(View view) {
        if(trigger){
            sumNum += 0.25;
            sumText.setText(String.valueOf(sumNum));
            trigger = false;
            changebuttonfrom();
        }
        else{
            sumNum += 3;
            sumText.setText(String.valueOf(sumNum));
        }

    }

    public void add4(View view) {
        sumNum += 4;
        sumText.setText(String.valueOf(sumNum));
    }

    public void add5(View view) {
        sumNum += 5;
        sumText.setText(String.valueOf(sumNum));
    }

    public void add6(View view) {
        sumNum += 6;
        sumText.setText(String.valueOf(sumNum));
    }

    public void add7(View view) {
        sumNum += 7;
        sumText.setText(String.valueOf(sumNum));
    }

    public void add8(View view) {
        sumNum += 8;
        sumText.setText(String.valueOf(sumNum));
    }

    public void add9(View view) {
        sumNum += 9;
        sumText.setText(String.valueOf(sumNum));
    }

    public void otherButton(View view) {
        changebuttonto();
        trigger = true;
    }

    public void clearText(View view) {
        sumNum = 0.0;
        sumText.setText(String.valueOf(sumNum));
    }

    public void changebuttonto() {
        button1.setText("1/2");
        button2.setText("1/3");
        button3.setText("1/4");
    }

    public void changebuttonfrom() {
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
    }

}
