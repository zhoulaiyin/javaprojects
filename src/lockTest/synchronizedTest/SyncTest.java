package lockTest.synchronizedTest;

class TestSynchronized {

    public synchronized void minus() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public static synchronized void minus1() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - 静态方法：" + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public synchronized void minus2() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count + "条");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public void simple() {
        int num = 10;

        synchronized (this) {
            for (int i=0; i<10; i++) {
                System.out.println(Thread.currentThread().getName() + "num：" + num + " - " + i + "-synchronized");
                ++num;
            }
        }
    }

}

public class SyncTest {
    public static void main(String[] args) {

        final TestSynchronized test = new TestSynchronized();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.minus();
            }
        }, "线程A");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                TestSynchronized.minus1();
            }
        }, "线程B");

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.simple();
            }
        }, "线程C");

        thread1.start();
        //thread2.start();
        thread3.start();
    }
}
