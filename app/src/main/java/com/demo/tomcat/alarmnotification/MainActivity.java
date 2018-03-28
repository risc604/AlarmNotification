package com.demo.tomcat.alarmnotification;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView    tvMsgBox;
    Button      btnSwitch;

    boolean     btnStatus = true;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initControl();
    }


    @SuppressLint("SetTextI18n")
    public void ButtonOnClick(View view)
    {
        if (btnStatus)
        {
            btnSwitch.setText("Stop");
            btnStatus = false;
        }
        else
        {
            btnSwitch.setText("Start");
            btnStatus = true;
        }
    }


    //-------------------- User function ------------------------//
    private void initView()
    {
        tvMsgBox = findViewById(R.id.textviewMsg);
        btnSwitch = findViewById(R.id.buttonSwitch);
    }

    private void initControl()
    {

    }

}
