package com.designpatterns.Proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String command) throws Exception {
        System.out.println(command);
        System.out.println("--------run command successfully-------");
    }
}
