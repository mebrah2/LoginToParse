package com.marekloose.logintoparse;

import android.app.Application;

import com.parse.Parse;

public class LoginToParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "YOUR_APPLICATION_ID", "YOUR_CLIENT_KEY");
    }
}
