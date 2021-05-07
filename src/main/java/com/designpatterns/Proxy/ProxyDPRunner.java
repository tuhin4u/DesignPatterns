package com.designpatterns.Proxy;

public class ProxyDPRunner {
    public static void main(String[] args) throws Exception {
        CommandExecutor executor=new CommandExecutorproxy("admin");
        executor.runCommand("my command");
        executor=new CommandExecutorproxy("user");
        executor.runCommand("my command");
    }
}
