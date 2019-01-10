package com.shadow.sync;

/**
 * @author qipeng.yan
 * @date 2019/1/9 8:33
 */
public class SyncTest {

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();

//        new Thread(() -> syncTest.a()).start();
//        new Thread(() -> syncTest.b()).start();

//        new Thread(() -> syncTest.m1()).start();
//        new Thread(() -> syncTest.m2()).start();


        new Thread(() -> syncTest.m3("lock1")).start();
        new Thread(() -> syncTest.m3("lock2")).start();
    }

    public void a() {
        System.out.println("进入a");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("退出a");
    }

    public void b() {
        System.out.println("进入b");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("退出b");
    }


    public synchronized void m1() {
        System.out.println("进入m1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("退出m1");
    }

    public synchronized void m2() {
        System.out.println("进入m2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("退出m2");
    }

    public void m3(String lock) {
        synchronized (lock) {
            System.out.println("进入" + lock);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("退出" + lock);
        }
    }

}
