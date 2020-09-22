package Properties;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @ClassName: TestProperties
 * @Description: ��ȡ�����ļ���Ϣ
 * @date: 2017��11��25�� ����10:56:00
 * @version: 1.0.0
 */
public class TestProperties {
    /**
     *
     * @Title: printAllProperty
     * @Description: �������������Ϣ
     * @param props
     * @return void
     * @throws
     */
    private static void printAllProperty(Properties props)
    {
        @SuppressWarnings("rawtypes")
        Enumeration en = props.propertyNames();
        while (en.hasMoreElements())
        {
            String key = (String) en.nextElement();
            String value = props.getProperty(key);
            System.out.println(key + " : " + value);
        }
    }

    /**
     * ����key��ȡvalue
     *
     * @Title: getProperties_1
     * @Description: ��һ�ַ�ʽ�������ļ���ʹ��spring�еĹ�������н���
     *                  filePath�����·�����ļ�����classpathĿ¼��
     *                   ���磺config.properties�ڰ�com.test.config�£�
     *                ·������com/test/config/config.properties
     *
     * @param filePath
     * @param keyWord
     * @return
     * @return String
     * @throws
     */
//    public static String getProperties_1(String filePath, String keyWord){
//        Properties prop = null;
//        String value = null;
//        try {
//            // ͨ��Spring�е�PropertiesLoaderUtils��������л�ȡ
//            prop = PropertiesLoaderUtils.loadAllProperties(filePath);
//            // ���ݹؼ��ֲ�ѯ��Ӧ��ֵ
//            value = prop.getProperty(keyWord);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return value;
//    }

    /**
     * ��ȡ�����ļ�������Ϣ
     *
     * @Title: getProperties_1
     * @Description: ��һ�ַ�ʽ�������ļ���ʹ��Spring�еĹ�������н���
     *                  filePath�����·�����ļ�����classpathĿ¼��
     *                   ���磺config.properties�ڰ�com.test.config�£�
     *                ·������com/test/config/config.properties
     *
     * @param filePath
     * @return void
     * @throws
     */
//    public static void getProperties_1(String filePath){
//        Properties prop = null;
//        try {
//            // ͨ��Spring�е�PropertiesLoaderUtils��������л�ȡ
//            prop = PropertiesLoaderUtils.loadAllProperties(filePath);
//            printAllProperty(prop);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * ����key��ȡvalue
     *
     * @Title: getProperties_2
     * @Description: �ڶ��ַ�ʽ��ʹ�û�����������ȡ�����ļ���Ȼ������أ��ٰ������
     *                    ����·�������·���� ��������·������ӵ�ǰ��Ŀ�µ�Ŀ¼��ʼ���㣬
     *                  �磺��ǰ��Ŀ·��/config/config.properties,
     *                  ���·������config/config.properties
     *
     * @param filePath
     * @param keyWord
     * @return
     * @return String
     * @throws
     */
    public static String getProperties_2(String filePath, String keyWord){
        Properties prop = new Properties();
        String value = null;
        try {
            // ͨ�����뻺�������ж�ȡ�����ļ�
            InputStream InputStream = new BufferedInputStream(new FileInputStream(new File(filePath)));
            // ����������
            prop.load(InputStream);
            // ���ݹؼ��ֻ�ȡvalueֵ
            value = prop.getProperty(keyWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * ��ȡ�����ļ�������Ϣ
     *
     * @Title: getProperties_2
     * @Description: �ڶ��ַ�ʽ��ʹ�û�����������ȡ�����ļ���Ȼ������أ��ٰ������
     *                    ����·�������·���� ��������·������ӵ�ǰ��Ŀ�µ�Ŀ¼��ʼ���㣬
     *                  �磺��ǰ��Ŀ·��/config/config.properties,
     *                  ���·������config/config.properties
     *
     * @param filePath
     * @return void
     * @throws
     */
    public static void getProperties_2(String filePath){
        Properties prop = new Properties();
        try {
            // ͨ�����뻺�������ж�ȡ�����ļ�
            InputStream InputStream = new BufferedInputStream(new FileInputStream(new File(filePath)));
            // ����������
            prop.load(InputStream);
            printAllProperty(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ����key��ȡvalue
     *
     * @Title: getProperties_3
     * @Description: �����ַ�ʽ��
     *                    ���·���� properties�ļ�����classpathĿ¼�£�
     *                  ���磺config.properties�ڰ�com.test.config�£�
     *                  ·������/com/test/config/config.properties
     * @param filePath
     * @param keyWord
     * @return
     * @return String
     * @throws
     */
    public static String getProperties_3(String filePath, String keyWord){
        Properties prop = new Properties();
        String value = null;
        try {
            InputStream inputStream = TestProperties.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            value = prop.getProperty(keyWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * ��ȡ�����ļ�������Ϣ
     *
     * @Title: getProperties_3
     * @Description: �����ַ�ʽ��
     *                    ���·���� properties�ļ�����classpathĿ¼�£�
     *                  ���磺config.properties�ڰ�com.test.config�£�
     *                  ·������/com/test/config/config.properties
     * @param filePath
     * @return
     * @throws
     */
    public static void getProperties_3(String filePath){
        Properties prop = new Properties();
        try {
            InputStream inputStream = TestProperties.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            printAllProperty(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // ע��·������
//        String properties_1 = getProperties_1("Config/application.properties", "http.maxTotal");
//        System.out.println("maxTotal = " + properties_1);
//        getProperties_1("application.properties");
//        System.out.println("********************* getProperties_1 ************************");

//        // ע��·������
//        String properties_2 = getProperties_2("/application.properties", "mongodb.uri");
//        System.out.println("jmongodb.uri = " + properties_2);
//        getProperties_2("/application.properties");
//        System.out.println("*******************  getProperties_2 **************************");

        // ע��·������
        String properties_3 = getProperties_3("/Config/jedis.properties", "host");
        System.out.println("host = " + properties_3);
        getProperties_3("/Config/jedis.properties");
        System.out.println("*******************  getProperties_3 **************************");
    }
}
