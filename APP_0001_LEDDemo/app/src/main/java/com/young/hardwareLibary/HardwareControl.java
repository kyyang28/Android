package com.young.hardwareLibary;

public class HardwareControl {
    public static native int ledCtrl(int whichLed, int ledStatus);
    public static native int ledOpen();
    public static native void ledClose();

    /*
     *  Step 1: load library, only executed once before instantiated an object
     *  static block which can be initialised only once
     */
    static {
        /* hardwareControl is the name of C program, i.e., hardwareControl.c */
        try {
            System.loadLibrary("hardwareControl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}