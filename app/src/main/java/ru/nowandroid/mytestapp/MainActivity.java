package ru.nowandroid.mytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ru.nowandroid.calc.CalcUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = CalcUtils.plus(2,33);

        Toast.makeText(this, "" + sum, Toast.LENGTH_SHORT).show();
    }
}
