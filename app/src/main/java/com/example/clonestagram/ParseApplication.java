package com.example.clonestagram;

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
                .applicationId("rYf1IKH1OOZM0o621saGczOFtGC2wAwjLaBCyJ5C")
                .clientKey("mRRjQCcrkM49aWblEffR9egXcYCcVMnzgRbF8WO3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
