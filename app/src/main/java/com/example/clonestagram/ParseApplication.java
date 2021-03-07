package com.example.clonestagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rYf1IKH1OOZM0o621saGczOFtGC2wAwjLaBCyJ5C")
                .clientKey("mRRjQCcrkM49aWblEffR9egXcYCcVMnzgRbF8WO3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
