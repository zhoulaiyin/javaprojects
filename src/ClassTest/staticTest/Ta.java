package ClassTest.staticTest;

public class Ta {
    public static int a = 1;

    static {
        System.out.println("这是静态块");
    }

    public static Object say() {
        System.out.println("静态say方法");

        return "static say() method";
    }
}
