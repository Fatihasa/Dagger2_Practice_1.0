package com.fatih.dagger2practice;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){

        remote.setListener(this);

    }

    public void drive(){
        Log.d("Car"," is driving...");
    }
}
