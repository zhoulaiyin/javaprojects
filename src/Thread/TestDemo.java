package Thread;

/**
 *
 Thread daemonTread = new Thread();

 //�趨 daemonThread Ϊ �ػ��̣߳�default false(���ػ��߳�)
 daemonThread.setDaemon(true);

 //��֤��ǰ�߳��Ƿ�Ϊ�ػ��̣߳����� true ��Ϊ�ػ��߳�
 daemonThread.isDaemon();
 */

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable tr = new TestRunnable();

        Thread thread = new Thread(tr);

        thread.setDaemon(true); //�����ػ��߳�

        thread.start(); //��ʼִ�зֽ���
    }
}
