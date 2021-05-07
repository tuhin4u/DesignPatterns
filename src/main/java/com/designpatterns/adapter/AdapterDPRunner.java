package com.designpatterns.adapter;

public class AdapterDPRunner {
    public static void main(String[] args) {
        SocketAdapter adapter=new SocketAdapterImpl();
        adapter.get3Volt();
    }
}
