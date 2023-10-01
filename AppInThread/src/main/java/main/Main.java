/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.concurrent.ArrayBlockingQueue;
import main.thread.MyRunnableAndCallable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import main.thread.MyRunnable1;

/**
 *
 * @author amila
 */
public class Main {

    public static void main(String[] args) throws Exception {

        //Thread t = new Thread(new MyProducer());
//                MyProducer m = new MyProducer();
//                m.doIt1();
//                m.doIt2();
//                m.doIt3();
//        
//        Thread t = new Thread(new MyRunnableAndCallable());
//        Thread t1 = new Thread(new MyRunnableAndCallable());
//        Thread t2 = new Thread(new MyRunnableAndCallable());
//        Thread t3 = new Thread(new MyRunnableAndCallable());
//
//        t.start();
//        t.join();
//        t1.start();
//        t2.start();
//        t3.start();
//        oneByOne(new MyRunnableAndCallable());
//        oneByOne(new MyRunnableAndCallable());
//       System.out.println("Run..............");
//        ex.shutdown();
//        ex.awaitTermination(5, TimeUnit.SECONDS);
////        System.out.println("terminated");
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        service.submit(new MyRunnable1());
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable1(1));
        }
//        ThreadPoolExecutor tpe = new ThreadPoolExecutor(10, 15, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
//        ExecutorService service2 = Executors.newCachedThreadPool(tpe.getThreadFactory());
////        ExecutorService service1 = new ThreadPoolExecutor(10, 15, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
//        System.out.println("run...");
//        ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
//        ex.schedule(new MyRunnable1(1), 0, TimeUnit.SECONDS);
//        ex.shutdown();
//        ex.awaitTermination(5, TimeUnit.SECONDS);
//        System.out.println("terminate is finished");
//        System.out.println("run...");
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        MyCallable[] arr = new MyCallable[3];
//        arr[0] = new MyCallable(1);
//        arr[1] = new MyCallable(2);
//        arr[3] = new MyCallable(3);
//         List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));
//         Future f =list.get(0);

    }

    public static void ScheduledThreadPool() {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
//        ScheduledFuture sf = ex.schedule(new MyRunnableAndCallable(1), 0, TimeUnit.SECONDS);

    }

    public static void CachedThreadPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10, 15, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service2 = Executors.newCachedThreadPool();
    }

    public static void oneByOne(Runnable r) throws Exception {
        Thread t = new Thread(r);
        t.start();
        t.join();
    }

    public static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();

//        Future f = service.submit(new MyRunnableAndCallable(1));
//        service.submit(new MyRunnableAndCallable(1));
//        service.submit(new MyRunnableAndCallable(1));
        service.shutdown();
    }

    public static void FixedThreadPool() {
        ExecutorService servvice = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            //    servvice.submit(new MyRunnableAndCallable(1));
//            servvice.shutdown();
        }
    }
}
