package com.example.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class LCOFaceDetection extends Application {

    public static final String RESULT_TEXT = "RESULT TEXT";
    public static final String RESULT_DIALOG = "RESULT DIALOG";


    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
