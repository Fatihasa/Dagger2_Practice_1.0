package com.fatih.dagger2practice.Dagger;

import com.fatih.dagger2practice.Car.Car;
import com.fatih.dagger2practice.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponant {


    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponant build();
    }
}
