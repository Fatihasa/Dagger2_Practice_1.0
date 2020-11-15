package com.fatih.dagger2practice.Dagger;

import android.util.Log;

import com.fatih.dagger2practice.Car.Rims;
import com.fatih.dagger2practice.Car.Tires;
import com.fatih.dagger2practice.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        Log.d("Tires ","Inflates...");
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
