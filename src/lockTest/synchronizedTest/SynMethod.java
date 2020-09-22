package lockTest.synchronizedTest;

public class SynMethod {
    private static final Object staticLockObj = new Object();
    /**
     * ������,���뼶��,ͬһ�������ø���,thisΪSynMethodʵ��,synchronized��������this������
     */
    public void method1() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }

    /**
     * ����������������,ͬһ�������ø���,��ͨ���Ǿ�̬������,synchronized�������ڵ��ø÷����Ķ�����,����һ��д������һ��
     */
    public synchronized void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
        }
    }

    /**
     * �����������뼶��,ͬһ�����ø���,����staticLockObj��,��ͬSynMethodʵ��,ӵ��ͬһ��staticLockObj����
     */
    public void method3() {
        synchronized (staticLockObj) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }

    /**
     * ����,���뼶��ͬһ�����ø���
     */
    public void method4() {
        synchronized (SynMethod.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }

    /**
     * ����,��������ͬһ�����ø���,synchronized��������SynMethod.class��
     */
    public static synchronized void staticMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
        }
    }
}
