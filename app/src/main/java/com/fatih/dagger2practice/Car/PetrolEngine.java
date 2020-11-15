package com.fatih.dagger2practice.Car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named ("horsePower") int horsePower,
                        @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d("Car","Petrol Engine is started. Horse Power is : "+horsePower
                            +"\nEngine Capacity is : "+engineCapacity);
    }
}
