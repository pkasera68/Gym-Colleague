package com.example.gymcolleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    public SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

    }
    public void openWrokoutActivity(View v)
    {
        Intent ob =new Intent(this,WorkoutActivity.class);
        startActivity(ob);
    }
    public void openWarmupActivity(View v)
    {
        Intent ob =new Intent(this,WarmUpActivity.class);
        startActivity(ob);
    }
}