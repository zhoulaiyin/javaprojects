package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class TestClassMethod {
    public static void main(String[] args) {
        String beanName = "Reflect.SimpleBean";

        String method = "method";

        String appid = "123456789";

        HashMap<String,Object> params = new HashMap<>();
        params.put("id", "123456789");
        params.put("name", "zly");

        try {
            // ���ݸ�����������ʼ����
            Class catClass = Class.forName(beanName);

            // ʵ���������
            Object obj = catClass.newInstance();

            //Method methodObj = catClass.getMethod(method, String.class);
            //methodObj.invoke(obj, appid);//���ʵ�����Ͳ���

            // ����ָ������
            Object result1 = catClass.getMethod(method, HashMap.class, String.class).invoke(obj, params, appid);
            System.out.println("result��" + result1);

            Object result2 = catClass.getMethod(method, HashMap.class).invoke(obj, params);
            System.out.println("result2��" + result2);

            Object result3 = catClass.getMethod(method, String.class).invoke(obj, appid);
            System.out.println("result2��" + result3);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
