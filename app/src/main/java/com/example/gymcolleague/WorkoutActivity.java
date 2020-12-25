package com.example.gymcolleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity extends AppCompatActivity {
    public SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);

    }
    public void openMuscle(View v)
    {
        Intent ob=new Intent(this,MuscleBuildActivity.class);
        startActivity(ob);
    }
}