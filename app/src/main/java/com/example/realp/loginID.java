package com.example.realp;

import android.app.Application;

public class loginID extends Application {
    private String mGlobalString;

    public String getGlobalString()
    {
     return mGlobalString;
    }

    public void setGlobalString(String globalString)
    {
        this.mGlobalString = globalString;
    }
}
