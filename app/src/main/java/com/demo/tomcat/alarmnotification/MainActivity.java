package com.demo.tomcat.alarmnotification;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// https://androidraja.blogspot.tw/2017/04/android-1.html
// http://blog.tonycube.com/2012/10/alarmnotification.html

// http://www.androhub.com/android-alarmmanager/
// https://google-developer-training.gitbooks.io/android-developer-fundamentals-course-practicals/content/en/Unit%203/82_p_alarm_manager.html
// https://javapapers.com/android/android-alarm-clock-tutorial/


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
