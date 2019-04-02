package com.example.demo.temp;

/**
 * @author sxp
 * @create 2019-04-02 13:56
 **/
public class Main {
    public static void main(String[] args) {
        //继承Thread类
//        MyThread myThread = new MyThread();
//        myThread.start();

        //实现Runnable接口
        Thread thread = new Thread(new MyThread2());
        thread.start();
        System.out.println("执行完毕");
    }
}
