package Reflect;

import Common.FuncUtil;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestIterator {
    private long times = 100_000_000L;
    private SimpleBean bean;
    private String formatter = "%s %d times using %d ms";

    public static void main(String[] args) {
        TestIterator a = new TestIterator();

        a.execute();
    }

    public void execute() {
        bean = new SimpleBean();
        bean.setName("haoyifen");

        directGet();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        try {
            javaReflectGet();
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        try {
            propertyGet();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    //直接通过Java的get方法
    public void directGet() {
        Long start_time = FuncUtil.microtime();

        for (long i = 0; i < times; i++) {
            bean.getName();
        }

        System.out.println("directGet耗时：" + (FuncUtil.microtime()-start_time));
    }

    //通过高性能的ReflectAsm库进行测试，仅进行一次methodAccess获取
//    public void reflectAsmGet() {
//        MethodAccess methodAccess = MethodAccess.get(SimpleBean.class);
//        Stopwatch watch = Stopwatch.createStarted();
//        for (long i = 0; i < times; i++) {
//            methodAccess.invoke(bean, "getName");
//        }
//        watch.stop();
//        String result = String.format(formatter, "reflectAsmGet", times, watch.elapsed(TimeUnit.MILLISECONDS));
//        System.out.println(result);
//    }

    //通过Java Class类自带的反射获得Method测试，仅进行一次method获取
    public void javaReflectGet() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException  {
        Long start_time = FuncUtil.microtime();

        Method getName = SimpleBean.class.getMethod("getName");
        for (long i = 0; i < times; i++) {
            getName.invoke(bean);
        }

        System.out.println("javaReflectGet耗时：" + (FuncUtil.microtime()-start_time));
    }

    //使用Java自带的Property属性获取Method测试，仅进行一次method获取
    public void propertyGet() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, IntrospectionException {
        Method method = null;
        BeanInfo beanInfo = Introspector.getBeanInfo(SimpleBean.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            if (propertyDescriptor.getName().equals("name")) {
                method = propertyDescriptor.getReadMethod();
                break;
            }
        }

        Long start_time = FuncUtil.microtime();

        for (long i = 0; i < times; i++) {
            method.invoke(bean);
        }

        System.out.println("propertyGet耗时：" + (FuncUtil.microtime()-start_time));
    }

    //BeanUtils的getProperty测试
//    public void beanUtilsGet() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Long start_time = FuncUtil.microtime();
//
//        for (long i = 0; i < times; i++) {
//            BeanUtils.getProperty(bean, "name");
//        }
//
//        System.out.println("beanUtilsGet耗时：" + (FuncUtil.microtime()-start_time));
//    }
}
