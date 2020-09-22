package Thread;

import java.io.*;

public class TestRunnable implements Runnable {
    public void run(){
 
        try{

            Thread.sleep(1000);//守护线程阻塞1秒后运行

            File f=new File("daemon.txt");

            FileOutputStream os=new FileOutputStream(f,true);

            os.write("daemon".getBytes());

        } catch(IOException e1) {
            e1.printStackTrace();
        } catch(InterruptedException e2) {
            e2.printStackTrace();
        }

    }
}
