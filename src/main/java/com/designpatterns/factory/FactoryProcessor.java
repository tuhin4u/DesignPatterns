package com.designpatterns.factory;

public class FactoryProcessor {
    public static IParser getProcessor(String type){
        IParser parser=null;
        if(type.equals("xml")){
            parser=new XMLParser();
        }else if (type.equals("csv")){
            parser=new CSVParser();
        }
        return parser;
    }
}
