package com.designpatterns.Proxy;

public class CommandExecutorproxy implements CommandExecutor{
    boolean isAdmin;
    String username;

    public CommandExecutorproxy(String username) {
        this.username = username;
        this.isAdmin=false;
        if (username.equals("admin"))
            isAdmin=true;
    }

    @Override
    public void runCommand(String command) throws Exception {
        CommandExecutor executor;
        if (isAdmin==true){
            executor=new CommandExecutorImpl();
            executor.runCommand(command);
        }else
            throw new AuthenticatioFailedException();
    }
}
