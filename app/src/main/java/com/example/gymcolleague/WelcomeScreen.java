package com.example.gymcolleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity
{
    public SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        preferences=getSharedPreferences("PREFERENCE",MODE_PRIVATE);
        String FirstTime=preferences.getString("FirstTimeInstall","");
        if(FirstTime.equals("Yes"))
        {
            startActivity(new Intent(getApplicationContext(),
                    MainActivity.class));
        }
        else {

            Button b = (Button) findViewById(R.id.start_workout);
            b.setOnClickListener(
                    new Button.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(getApplicationContext(),
                                    MainActivity.class));
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString("FirstTimeInstall", "Yes");
                            editor.apply();
                        }
                    }
            );
        }
    }
}