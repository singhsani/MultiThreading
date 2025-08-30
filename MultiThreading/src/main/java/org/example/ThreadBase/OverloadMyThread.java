package org.example.ThreadBase;

/**
 * overloading is possible but no-args run() method always run by thread
 * other overloaded method run as normal method
 *
 */
public class OverloadMyThread extends Thread{
   public void run(){
       System.out.println("no-args method");
   }
   public void run(int i){
       System.out.println("int-args method");
   }
}
