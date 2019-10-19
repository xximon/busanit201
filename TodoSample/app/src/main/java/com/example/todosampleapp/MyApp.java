package com.example.todosampleapp;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initRoom();
        initStetho();
    }
    private void initStetho(){

    }
    private void initRoom(){

    }
}
