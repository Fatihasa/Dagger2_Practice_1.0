package com;

import android.app.Application;

import com.fatih.dagger2practice.Dagger.CarComponant;
import com.fatih.dagger2practice.Dagger.DaggerCarComponant;

public class ExampleApp extends Application {

    private CarComponant componant;

    @Override
    public void onCreate() {
        super.onCreate();

        componant = DaggerCarComponant.builder()
                .horsePower(120)
                .engineCapacity(1300)
                .build();
    }

    public CarComponant getAppComponant(){
        return componant;
    }
}
