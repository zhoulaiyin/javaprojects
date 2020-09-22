package Regex;

import java.util.List;

public class MatchField {

    public List<String> getKeywords(String p){
        String reg = "(?<=(?<!\\\\)\\$\\{)(.*?)(?=(?<!\\\\)\\})";
        RegExp re = new RegExp();
        List<String> list = re.find(reg, p);
        return list;
    }

    public static void main(String[] args) {
        //String pattern = "${\W+}";
        String str = "${bill.money}-${bill.goods.gt}*(${bill.goods.price}*${bill.goods.num})";

        MatchField p = new MatchField();

        System.out.println("field-->"+p.getKeywords(str));
        System.out.println(p.getKeywords("a${a}a"));
        System.out.println(p.getKeywords("a\\${a}a"));
        System.out.println(p.getKeywords("a${a\\}a"));
        System.out.println(p.getKeywords("a${a\\}a}a"));
        System.out.println(p.getKeywords("a${a}a${"));
        System.out.println(p.getKeywords("a${ab}a${a}"));
    }
}
