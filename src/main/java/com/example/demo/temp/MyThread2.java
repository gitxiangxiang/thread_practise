package com.example.demo.temp;

/**
 * @author sxp
 * @create 2019-04-02 14:29
 **/
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("第"+i+"步");
        }
    }
}
