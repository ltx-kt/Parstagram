package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PNUbzvJXmCAKYEqheKDjBsheED3ewpHIDEgIjtw3")
                .clientKey("a09gBtyspHkOz3kGbIsaRuf4DA8lCpaom9mZDG6O")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
