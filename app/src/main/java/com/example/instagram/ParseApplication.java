package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0yJasoDV1jA4J8aCpjTjp5NQmTdQ0GH7vLnlLXPT")
                .clientKey("9lswisgLCqKHZrzHNqT7rCrNQOjI2vtZVsIjd9JT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
