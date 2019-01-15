package com.shadow.sync;

public class SynchronizedDemo {
    public static void main(String[] args) {
        new Thread(() -> SynchronizedDemo.method1()).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> SynchronizedDemo.method1()).start();
    }


    private static void method1() {
        System.out.println(Thread.currentThread().getName() + "进入method1");
        synchronized (SynchronizedDemo.class) {
            System.out.println(Thread.currentThread().getName() + "进入method1同步块");
        }
        System.out.println(Thread.currentThread().getName() + "休眠2秒");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "休眠结束");
        method2();
        System.out.println(Thread.currentThread().getName() + "退出method1");
    }

    public static void method2() {
        System.out.println(Thread.currentThread().getName() + "进入method2");
        System.out.println(Thread.currentThread().getName() + "退出method2");
    }
}
