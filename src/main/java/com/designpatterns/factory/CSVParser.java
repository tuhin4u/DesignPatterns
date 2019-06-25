package com.designpatterns.factory;

public class CSVParser implements IParser{
    public void parse(String data){
        System.out.println("parsing from csv parser");
    }
}
