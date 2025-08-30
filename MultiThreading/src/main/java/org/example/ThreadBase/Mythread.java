package org.example.ThreadBase;


public class Mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("parent thread");
        }
    }
}
