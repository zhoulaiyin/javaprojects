package lockTest.synchronizedTest;

public class SynTest {
    public static void main(String[] args) {
        final SynMethod t1 = new SynMethod();
        final SynMethod t2 = new SynMethod();

        Thread ta = new Thread(new Runnable() {
            @Override
            public void run() {
                t1.method4();
            }
        }, "A");
        Thread tb = new Thread(new Runnable() {
            @Override
            public void run() {
                t2.method2();
            }
        }, "B");

        ta.start();
        tb.start();
    }
}
