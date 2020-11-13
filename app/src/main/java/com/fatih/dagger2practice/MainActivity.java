package com.fatih.dagger2practice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.fatih.dagger2practice.Car.Car;
import com.fatih.dagger2practice.Dagger.CarComponant;
import com.fatih.dagger2practice.Dagger.DaggerCarComponant;
import com.fatih.dagger2practice.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponant carComponant = DaggerCarComponant.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();




        carComponant.inject(this);
        car.drive();


    }
}