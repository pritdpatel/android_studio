package com.dometell.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count;
    String str;
    Button btn,getbtn,setbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);
        btn=( Button ) findViewById(R.id.add);
        count=1;
        getbtn=( Button ) findViewById(R.id.get);
        setbtn=( Button ) findViewById(R.id.set);

        setbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(str);
            }
        });
        getbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=(String)textView.getText();
            }
        });
        //button onclick
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
               textView.setText(""+count);
            }
        });

    }
}