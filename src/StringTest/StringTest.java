package StringTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String args[]) {
    	String field = "goods.goods_num";
    	
    	String[] childFields = field.split(".");
    	
    	for(int i =0; i < childFields.length ; i++){
            System.out.println(childFields[i]);
            System.out.println("");
        }

    	String a = "123";
    	String b = "123";
    	String c = new String("123");

        String aa = new StringBuffer(b).reverse().toString();

        System.out.println("a==b  " + (a==b));
        System.out.println("a.equals(b)  " + (a.equals(b)));
        System.out.println("a==c  " + (a==c));
        System.out.println("a.equals(c)  " + (a.equals(c)));
        System.out.println("reverse  " + aa);

        //Method m = new StringMethod();
        //m.Concate();

        //        String exp_str = "${bill_delivery.yet_total_money}+SUM(${bill_delivery.goods.apply_num}*${bill_delivery.goods.goods_price})";
//
//        String find_str = searchAndMatch(exp_str, "SUM(");
//
//        System.out.println(find_str);
//
//        System.out.println(find_str.substring(4, find_str.length()-1));
    }

    //返回匹配到的规则表达式
    public static String searchAndMatch(String source, String exp) {
        if (source.indexOf(exp) == -1) {
            return "";
        }

        int find_index = source.indexOf(exp);
        int source_len = source.length();
        int left_num = 0;
        int right_num = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=find_index; i<source_len; i++) {
            String symbol = source.substring(i, i+1);

            stringBuilder.append(symbol); //拼接查找字符串

            //如果既不是左括号，也不是右括号，则跳过
            if (!symbol.equals("(") && !symbol.equals(")")) {
                continue;
            }

            //如果是左括号，左括号计数+1
            if (!symbol.equals("(")) {
                ++left_num;
                continue;
            }

            ++right_num;

            //如果右括号的数量与之前查找到的左括号数量一致，停止检查
            if (right_num == left_num) {
                break;
            }
        }

        return stringBuilder.toString();
    }

    public static String getObjAlias(String obj_alias){
        Matcher p1 = Pattern.compile(":source").matcher(obj_alias);
        Matcher p2 = Pattern.compile(":action").matcher(obj_alias);

        if (p1.find()) {
            return obj_alias.substring(0, p1.start());
        }

        if (p2.find()) {
            return obj_alias.substring(0, p2.start());
        }

        return obj_alias;
    }
}
