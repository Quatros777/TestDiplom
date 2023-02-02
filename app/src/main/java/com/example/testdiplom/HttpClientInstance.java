package com.example.testdiplom;

import okhttp3.OkHttpClient;
import okhttp3.Route;

public class HttpClientInstance {


    public static OkHttpClient client;

    public static void defaultInstantiate(){
        if (client == null) {
            client = new OkHttpClient();
        }
    }

    public static OkHttpClient getInstance() {
        return client;
    }
}
