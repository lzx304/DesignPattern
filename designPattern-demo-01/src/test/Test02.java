package test;

import javax.annotation.PostConstruct;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/19 9:57:22
 */
public class Test02 {
    public static void main(String[] args) {
        int executorSize = 2 * Runtime.getRuntime().availableProcessors();
        ExecutorService es =  Executors.newCachedThreadPool(new WorkThreadFactory());



    }
}

class WorkThreadFactory implements ThreadFactory {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public Thread newThread(Runnable r) {
        int c = atomicInteger.incrementAndGet();
        System.out.println("create no " + c + " Threads");
        return new WorkThread(r, atomicInteger);//通过计数器，可以更好的管理线程
    }
}

class WorkThread extends Thread {
    private Runnable target;   //线程执行目标
    private AtomicInteger counter;

    public WorkThread(Runnable target, AtomicInteger counter) {
        this.target = target;
        this.counter = counter;
    }
    @Override
    public void run() {
        try {
            target.run();
        } finally {
            int c = counter.getAndDecrement();
            System.out.println("terminate no " + c + " Threads");
        }
    }
}



