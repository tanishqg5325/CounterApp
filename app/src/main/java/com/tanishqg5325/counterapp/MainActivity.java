package com.tanishqg5325.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static int counter=0;
    private TextView ctrDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctrDisplay = findViewById(R.id.ctr_display);
        ctrDisplay.setText(Integer.toString(counter));
    }

    public void display(int counter) {
        ctrDisplay.setText(Integer.toString(counter));
    }
    public void dec(View view) {
        if(counter!=0) {
            counter--;
            display(counter);
        }
        else{
            Toast.makeText(this, "Counter cannot be decreased beyond 0 !", Toast.LENGTH_SHORT).show();
        }
    }
    public void inc(View view) {
        counter++;
        display(counter);
    }
    public void reset(View view) {
        counter=0;
        display(counter);
    }
}