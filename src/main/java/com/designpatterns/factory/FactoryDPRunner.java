package com.designpatterns.factory;

public class FactoryDPRunner {
    public static void main(String[] args) {
        BatchProcessor processor=new BatchProcessor();
        processor.processBatch("data","csv");
    }
}
