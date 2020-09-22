package lockTest.lockTest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private Lock lock = new ReentrantLock();

    public void f() {
        // other operations should not be locked...
        System.out.println(Thread.currentThread().getName()
                + ":not synchronized in f()");
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ":synchronized in f()");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void g() {
        // other operations should not be locked...
        System.out.println(Thread.currentThread().getName()
                + ":not synchronized in g()");
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ":synchronized in g()");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void h() {
        // other operations should not be locked...
        System.out.println(Thread.currentThread().getName()
                + ":not synchronized in h()");
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ":synchronized in h()");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final LockTest rs = new LockTest();

        new Thread() {
            public void run() {
                rs.f();
            }
        }.start();

        new Thread() {
            public void run() {
                rs.g();
            }
        }.start();

        rs.h();
    }
}
