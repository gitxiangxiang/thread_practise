package com.example.demo.temp;

/**
 * @author sxp
 * @create 2019-04-02 14:14
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<5;i++){
            System.out.println("第"+i+"步");
        }
    }
}
