package ExceptionTest;

public class SelfException {
    public static void main(String args[]) {
        int a = 0;
        try{
            //throw new Exception("这是抛出的主动异常");

            a = 10/0;
        } catch (Exception e) {
            System.out.println("err-->" + e);
        }

        System.out.println("没有异常");
    }
}
