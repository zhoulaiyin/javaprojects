import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Common.FuncUtil;

public class Test {
    public static void matchTest() {
        String expStr = "SUM($a*5)";

        //���������
        String[] funcs = {
                "ABS","AVERAGE","CEILING","COUNTIF","FIXED","INT","LARGE","LOG","MOD","POWER","PRODUCT",
                "RAND","SMALL","SQRT","SUM","SUMPRODUCT","MAX","MIN","LOG","ROUND","SQRT","FLOOR"
        };

        String exp = expStr.toUpperCase();

        int count = funcs.length;

        //ƥ����ѧ����
        for (int i=0; i<count; i++) {
            String regex = "(?<=(?<!\\\\)"+funcs[i]+"\\()(.*?)(?=(?<!\\\\)\\))";
            String regex_1 = "(?<="+funcs[i]+"\\()[^\\)]+";
            String regex_2 = "(?<="+funcs[i]+"\\()[^\\)]+";
            String regex_3 = "(.*?)"+funcs[i]+"\\((.*?)\\)(.*?)";

            if (Pattern.compile(regex_3).matcher(exp).matches()) {
                System.out.println("ƥ�䵽�˺���:" + funcs[i]);
            }
        }

        System.out.println("û��ƥ����");
    }
    public static void strTest() {
        String str = "yulv # 123456 # yulv@21cn.com";
        Matcher matcher = Pattern.compile("#").matcher(str);
        System.out.println(matcher.find());
        if(matcher.find()){
            System.out.println(matcher.start());
        }else{
            System.out.println("null");
        }

        String[] strList = new String[]{"12","34","56","78"};

        System.out.println("ͨ��join����" + String.join("|", strList));

        String aa = "bill:source.bill_no";

        int find_index = aa.indexOf(":source");

        System.out.println("field-->" + aa.substring(aa.indexOf(".")+1));

        System.out.println("find_index-->" + find_index);

        System.out.println("substring-->" + aa.substring(0, find_index));
    }
    public static void mapTest() {
        HashMap<String,Object> complex = new HashMap<>();
        complex.put("name", "zly");
        complex.put("age", 30);
        complex.put("is_man", true);

        if (complex.get("name").equals("zly")) {
            System.out.println("�ַ������");
        }

        if (complex.get("age").equals(30)) {
            System.out.println("�������");
        }

        if (complex.get("is_man").equals(true)) {
            System.out.println("����ֵ���");
        }

        HashMap<String,Object> a = new HashMap<>();
        a.put("name", "zly");
        a.put("age", 30);

        for (String k: a.keySet()) {
            System.out.println("a before ��ֵ��"+k+"��ֵ��"+a.get(k));
        }

//        HashMap<String,Object> b = a;

        HashMap<String,Object> b = new HashMap<>();
        b.putAll(a);

        for (String k: b.keySet()) {
            System.out.println("b before ��ֵ��"+k+"��ֵ��"+a.get(k));
        }

        b.put("age", 28);
        //a.put("age", 40);

        for (String k: a.keySet()) {
            System.out.println("a after ��ֵ��"+k+"��ֵ��"+a.get(k));
        }

        for (String k: b.keySet()) {
            System.out.println("b after ��ֵ��"+k+"��ֵ��"+b.get(k));
        }
    }
	public static void main(String[] args) throws Exception {
//        HashMap<String, Object> rtn = new HashMap<>();
//        rtn.put("code", 9999999);
//        rtn.put("message", "ok");
//
//        if (rtn.get("code").equals(9999999)) {
//            System.out.println("���");
//        } else {
//            System.out.println("�����");
//        }
//
//        HashMap<String, Object> dt = new HashMap<>();
//        dt.put("name", "zly");
//        dt.put("age", 18);
//
//        System.out.println(Math.round(1.5));
//        System.out.println(Math.round(-1.5));
//
//        String numStr = "19";
//
//        System.out.println("�ַ�������ת�����ͣ�" + Integer.valueOf(numStr).equals(19));

        //-128 ~ +127 ֮��
        Integer a = 5;
        int b = 5;
        Integer c = new Integer(5);
        Integer d = 5;

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a == d);

        System.out.println("  ");

        //-128 ~ +127 ֮��
        a = 128;
        b = 128;
        c = new Integer(128);
        d = 128;

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a == d);

        System.out.println("  ");

        String str1 = "abc";
        String str2 = "abc";

        System.out.println("str1==str2��" + (str1==str2));
        System.out.println("str1==str2��" + (str1.equals(str2)));
	}

}
