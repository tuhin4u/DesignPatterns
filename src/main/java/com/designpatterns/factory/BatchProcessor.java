package com.designpatterns.factory;

public class BatchProcessor {
    public void processBatch(String data,String type){
        System.out.println("calling parser");
        IParser parser = FactoryProcessor.getProcessor(type);
        parser.parse(data);

        System.out.println("process in batch..completed");
    }
}
