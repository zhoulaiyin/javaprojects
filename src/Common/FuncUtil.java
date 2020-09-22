package Common;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;

public class FuncUtil {

    //判断是否为固定电话
    public static boolean isPhone(String s) {
        String regex = "(^\\+86\\.\\d{3,5}\\d{6,8}$)|(^((0\\d{2,3})-?)(\\d{7,8})(-(\\d{3,}))?$)";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(s).matches();
    }

    //判断是否为手机号
    public static boolean isMobile(String s) {
        if (s.length() != 11) {
            return false;
        }

        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(s).matches();
    }

    //判断Email合法性
    public static boolean isEmail(String s) {
        if (s == null) {
            return false;
        }

        String regex = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(s).matches();
    }

    //判断是否为链接地址
    public static boolean isUrl(String s){
        Pattern pattern = Pattern.compile("((http|https):\\/\\/([\\w\\-]+\\.)+[\\w\\-]+(\\/[\\w\\u4e00-\\u9fa5\\-\\.\\/?\\@\\%\\!\\&=\\+\\~\\:\\#\\;\\,]*)?)", Pattern.CASE_INSENSITIVE );
        return pattern.matcher(s).matches();
    }

    //判断是否为数字
    public static boolean isNumber(String s){
        Pattern pattern = Pattern.compile("^[1-9]\\d*$", Pattern.CASE_INSENSITIVE );
        return "0".equals(s) || pattern.matcher(s).matches();
    }

    //判断是否为邮政编码
    public static boolean isPostCode(String postCode){
        return Pattern.matches("[1-9]\\d{5}", postCode);
    }

    //判断是否为日期格式
    public static boolean isDate(String strDate) {
        Pattern pattern = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))?$");
        return pattern.matcher(strDate).matches();
    }

    //判断是否为日期时间格式
    public static boolean isDateTime(String str) {
        SimpleDateFormat format  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            format.setLenient(false);
            format.parse(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //判断是否为邮政编码
    public static boolean isIDCard(String IdCard){
        return IdCardVerification.IDCardValidate(IdCard);
    }

    /**
     * 判断object是否为基本类型
     * @param object
     * @return
     */
    public static boolean isBaseType(Object object) {
        Class className = object.getClass();
        if (className.equals(java.lang.Integer.class) ||
                className.equals(java.lang.Byte.class) ||
                className.equals(java.lang.Long.class) ||
                className.equals(java.lang.Double.class) ||
                className.equals(java.lang.Float.class) ||
                className.equals(java.lang.Character.class) ||
                className.equals(java.lang.Short.class) ||
                className.equals(java.lang.Boolean.class)) {
            return true;
        }
        return false;
    }

    /**
     * 获取对象类型
     * @param object
     * @return
     */
    public static String ObjectType(Object object) {
        Class className = object.getClass();

        String Type = null;

        if (className.equals(java.lang.Integer.class)) {
            Type = "Integer";
        } else if (className.equals(java.lang.Byte.class)) {
            Type = "Byte";
        } else if (className.equals(java.lang.Long.class)) {
            Type = "Long";
        } else if (className.equals(java.lang.Double.class)) {
            Type = "Double";
        } else if (className.equals(java.lang.Float.class)) {
            Type = "Float";
        } else if (className.equals(java.lang.Character.class)) {
            Type = "Character";
        } else if (className.equals(java.lang.Short.class)) {
            Type = "Short";
        } else if (className.equals(java.lang.Boolean.class)) {
            Type = "Boolean";
        } else if (className.equals(java.lang.String.class)) {
            Type = "String";
        } else if (className.equals(java.lang.Object.class)) {
            Type = "Object";
        } else if (className.equals(java.util.HashMap.class)) {
            Type = "HashMap";
        } else if (className.equals(java.util.ArrayList.class)) {
            Type = "ArrayList";
        } else if (className.equals(java.util.List.class)) {
            Type = "List";
        }

        return Type;
    }

    /**
     * 对映射进行排序
     * @param map
     * @return
     */
    public static HashMap<String, String> sortMap(HashMap<String, String> map) {
        List<String> aList = new ArrayList<>();

        for(Map.Entry<String,String> entry: map.entrySet()) {
            aList.add(entry.getKey());
        }

        // sorting the List
        Collections.sort(aList);

        // Storing the list into Linked HashMap to preserve the order of insertion.
        HashMap aMap2 = new HashMap<>();
        for(String k: aList){
            aMap2.put(k, map.get(k));
        }

        return aMap2;
    }

    /**
     * 返回信息方法
     * @param msg //错误信息
     * @param code //错误码
     * @return
     */
    public static HashMap<String, Object> response(String msg, int code) {
        HashMap<String, Object> return_data = new HashMap<>();
        return_data.put("code", code);
        return_data.put("message", msg);
        return return_data;
    }

    /**
     * 返回信息方法
     * @param msg //错误信息
     * @param code //错误码
     * @param data //返回数据
     * @return
     */
    public static HashMap<String, Object> response(String msg, int code, Object data) {
        HashMap<String, Object> return_data = new HashMap<>();
        return_data.put("code", code);
        return_data.put("message", msg);
        return_data.put("data", data);
        return return_data;
    }

    /**
     * 利用反射实现
     * <li>空属性不转换
     * <li>超过10万条数据不建议使用
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> objectToMap(Object obj) {
        if (obj == null) {
            return null;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(obj));
            }
        } catch (Exception e) {
            System.out.println("objectToMap:"+e);
        }

        return map;
    }

    //获取当前日期
    public static String curDate() {
        return new SimpleDateFormat ("yyyy-MM-dd").format(new Date());
    }

    //获取当前时间
    public static String curTime() {
        return new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    //获取当前秒级时间戳
    public static int timeStamp() {
        return Integer.valueOf(String.valueOf(new Date().getTime()/1000));
    }

    //获取毫秒级时间戳
    public static Long microtime() {
        return System.currentTimeMillis();
    }

    /**
     * 获取过去第几天的日期
     *
     * @param past
     * @return
     */
    public static String getPastDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String result = format.format(today);
        return result;
    }

    /**
     * 获取未来 第 past 天的日期
     * @param past
     * @return
     */
    public static String getFetureDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String result = format.format(today);
        return result;
    }

    //精确小数点
    public static Double toDecimal(String num, int precision) {
        return (new BigDecimal(num).setScale(precision,BigDecimal.ROUND_HALF_UP)).doubleValue();
    }

    //判断是否包含英文字符串
    public static boolean isWord(String string) {
        Pattern p = Pattern.compile("[a-zA-z]");
        if(p.matcher(string).find()) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串中是否包含中文
     * @param str
     * 待校验字符串
     * @return 是否为中文
     * @warn 不能校验是否为中文标点符号
     */
    public static boolean hasChinese(String str) {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

    /**
     * 判定输入的是否是汉字
     *
     * @param c
     *  被校验的字符
     * @return true代表是汉字
     */
    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }

    /**
     * 校验String是否全是中文
     *
     * @param name
     *  被校验的字符串
     * @return true代表全是汉字
     */
    public static boolean isAllChinese(String name) {
        boolean res = true;
        char[] cTemp = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (!isChinese(cTemp[i])) {
                res = false;
                break;
            }
        }
        return res;
    }

    //判断字符串是否为整型
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    //判断字符串是否为数字类型
    public static boolean isNumeric(String str) {
        // 该正则表达式可以匹配所有的数字 包括负数
        Pattern pattern = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;//异常 说明包含非数字。
        }

        Matcher isNum = pattern.matcher(bigStr); // matcher是全匹配
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    //判断是否为数组
    public static boolean isArray(Object o) {
        if (
            o.getClass().equals(java.util.ArrayList.class)
            || o.getClass().equals(java.util.LinkedList.class)
            || o.getClass().equals(java.util.LinkedHashMap.class)
        ) {
            return true;
        }
        return false;
    }

    //判断是否为Map类型
    public static boolean isMap(Object o) {
        return o instanceof Map ? true : false;
    }

    //判断是否为字符串类型
    public static boolean isString(Object obj) {
        return obj instanceof String;
    }

    //判断是否为空对象
    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }

        if (o instanceof Map) {
            return ((Map) o).isEmpty();
        }

        if (o instanceof List) {
            return ((List) o).size() == 0;
        }

        if (o instanceof String) {
            return o.toString().trim().equals("");
        }

        return false;
    }

    //生成uuid
    public static String makeUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //记录代码异常报错信息
    public static void logErr(Exception ex) {
        StackTraceElement stackTraceElement= ex.getStackTrace()[ex.getStackTrace().length-1]; //得到异常棧的首个元素
        System.out.println("ExceptionFile="+stackTraceElement.getFileName());
        System.out.println("ExceptionLine="+stackTraceElement.getLineNumber());
        System.out.println("ExceptionMethod="+stackTraceElement.getMethodName());
    }

    //数组去重
    public static String[] array_unique(String [] arrStr) {
        Map<String, Object> map = new HashMap<String, Object>();
        for (String str : arrStr) {
            map.put(str, str);
        }

        return map.keySet().toArray(new String[1]);
    }
}
