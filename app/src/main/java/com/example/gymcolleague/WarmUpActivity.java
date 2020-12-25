package  com.example.gymcolleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gymcolleague.R;

public class WarmUpActivity extends AppCompatActivity {
    public SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warmup);

    }
    public void openDayOne(View v)
    {
        Intent ob=new Intent(this,WarmUpDayOne.class);
        startActivity(ob);
    }
    public void openDayTwo(View v)
    {
        Intent ob=new Intent(this,WarmUpDayTwo.class);
        startActivity(ob);
    }
    public void openDayThree(View v)
    {
        Intent ob=new Intent(this,WarmUpDayThree.class);
        startActivity(ob);
    }
    public void openDayFour(View v)
    {
        Intent ob=new Intent(this,WarmUpDayFour.class);
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