package com.newbiejavatester.domainobject;

public class TestAppEnv {
    public static final String DOMAIN = "192.168.0.3";
    public static final String PORT = "67";
    public static String getUrl(){
        return "http://" + DOMAIN + ":" + PORT;
    }
}
