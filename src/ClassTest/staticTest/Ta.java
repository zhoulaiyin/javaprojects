package ClassTest.staticTest;

public class Ta {
    public static int a = 1;

    static {
        System.out.println("���Ǿ�̬��");
    }

    public static Object say() {
        System.out.println("��̬say����");

        return "static say() method";
    }
}
