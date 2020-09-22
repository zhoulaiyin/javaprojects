package ExceptionTest;

import java.io.*;

public class ExcepTest {
    public static String test() {
        int a = 1;

        try{
            if (a >= 1) {
                throw new Exception("主动抛出异常");
            }

            int num = 1 / 0;
        } catch (Exception e) {
            return e.getMessage();
        } finally {
            System.out.println("come into finally");
        }

        return "OK";
    }

    public static void main(String args[]){
//        try{
//            int a[] = new int[2];
//            System.out.println("Access element three :" + a[3]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception thrown  :" + e);
//        }
//        System.out.println("Out of the block");

        System.out.println("===>" + test());
    }
}
