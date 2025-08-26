package org.example;

import org.example.RunnableInterface.MyThread;
import org.example.ThreadBase.Mythread;
import org.example.ThreadBase.OverloadMyThread;
import org.example.ThreadBase.OverridingStartMethod;
import org.example.ThreadBase.WithoutRumMethodOverriding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Mythread t=new Mythread();
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("child Thread");
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        }
        OverloadMyThread t1=new OverloadMyThread();
        t1.start();
        WithoutRumMethodOverriding wrmo=new WithoutRumMethodOverriding();
        wrmo.start();


        OverridingStartMethod osm=new OverridingStartMethod();
        osm.start();

        MyThread r=new MyThread();
        Thread tr=new Thread(r);
        tr.start();


    }
}