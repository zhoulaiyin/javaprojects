package Thread;

/**
 *
 Thread daemonTread = new Thread();

 //设定 daemonThread 为 守护线程，default false(非守护线程)
 daemonThread.setDaemon(true);

 //验证当前线程是否为守护线程，返回 true 则为守护线程
 daemonThread.isDaemon();
 */

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable tr = new TestRunnable();

        Thread thread = new Thread(tr);

        thread.setDaemon(true); //设置守护线程

        thread.start(); //开始执行分进程
    }
}
