package com.fatih.dagger2practice.Car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    @Inject
    public Remote() {
    }

    
    public void setListener(Car car){

        Log.d("Remote "," activated !!!");
    }
}


