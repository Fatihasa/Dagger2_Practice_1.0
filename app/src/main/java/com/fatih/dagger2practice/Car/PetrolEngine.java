package com.fatih.dagger2practice.Car;

import android.util.Log;

public class PetrolEngine implements Engine{

    private int horsePower;


    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("Car","Petrol Engine is started. Horse Power is : "+horsePower);
    }
}
