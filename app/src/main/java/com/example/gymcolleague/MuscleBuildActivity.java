package  com.example.gymcolleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gymcolleague.R;

public class MuscleBuildActivity extends AppCompatActivity {
    public SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle);

    }
    public void openChest(View v)
    {
        Intent ob=new Intent(this,Chest.class);
        startActivity(ob);
    }
    public void openBiceps(View v)
    {
        Intent ob=new Intent(this,Biceps.class);
        startActivity(ob);
    }
    public void openTriceps(View v)
    {
        Intent ob=new Intent(this,Triceps.class);
        startActivity(ob);
    }
    public void openShoulders(View v)
    {
        Intent ob=new Intent(this,Shoulders.class);
        startActivity(ob);
    }
    public void openDayFive(View v)
    {
        Intent ob=new Intent(this,WarmUpDayFive.class);
        startActivity(ob);
    }
    public void openDaySix(View v)
    {
        Intent ob=new Intent(this,WarmUpDaySix.class);
        startActivity(ob);
    }
    public void openDaySeven(View v)
    {
        Intent ob=new Intent(this,WarmUpDaySeven.class);
        startActivity(ob);
    }
}