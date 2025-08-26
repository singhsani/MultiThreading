package org.example.ThreadBase;

/**
 * if we override start() then our start method will be excuted just like method call
 * and new thread won't be created
 * it is not recommand to override start() other wise don't go for multi threading concept
 */
public class OverridingStartMethod extends Thread{
    public void start(){
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }
}
