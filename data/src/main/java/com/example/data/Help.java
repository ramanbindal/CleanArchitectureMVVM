package com.example.data;

import android.util.Log;

import com.example.data.sharedpreference.SharedPreferenceHelper;

import static com.example.data.Const.LOG_TAG;

//for logging purposes
public class Help {

    public static void L(String msg) {
        Log.i(LOG_TAG, msg);
    }

    public static void L(int value) {
        Log.i(LOG_TAG, String.valueOf(value));
    }

    public static void E(String msg) {
        Log.e(LOG_TAG, msg);
    }

    public static void E(int value) {
        E(String.valueOf(value));
    }

    public static void printSharedPref(SharedPreferenceHelper helper) {
   }
}
