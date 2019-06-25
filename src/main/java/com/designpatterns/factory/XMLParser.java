package com.designpatterns.factory;

public class XMLParser implements IParser{
    public void parse(String data) {
        System.out.println("parsing from xml parser");
    }
}
