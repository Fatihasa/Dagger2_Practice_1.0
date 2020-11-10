package com.fatih.dagger2practice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponant carComponant = DaggerCarComponant.create();

        car = carComponant.getCar();
        car.drive();


    }
}