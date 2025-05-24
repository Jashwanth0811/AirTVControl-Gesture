package com.airtvcontrol;

public class ADBSender {

    public static void sendADBCommand(String command) {
        try {
            Runtime.getRuntime().exec("adb shell input keyevent " + command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}