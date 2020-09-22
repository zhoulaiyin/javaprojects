package Eval;

import Common.FuncUtil;
import Common.ObjectUtil;
import jdk.nashorn.api.scripting.JSObject;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class evalTest {
    private static ScriptEngine se = new ScriptEngineManager().getEngineByName("js");

    public static void main(String[] args) {
        String mathStr = "0.14";
        String ifStr = "13>12&&'张三1'=='张三'";
        String ifConditions = "('创建' == '创建')";
        String chineseStr = "'创建'";
        String mapStr = "{\"a\":123, \"b\": 456, \"c\": {\"a\":123, \"b\": 456}}";
        String timeStr = "2020-01-01";

        Object s = "";

        System.out.println("字符串toString()"+s.toString());

        HashMap<String, Object> map = (HashMap<String, Object>) eval(mapStr);

        for (Object k: map.keySet()) {
            System.out.println("键："+k+"，值："+map.get(k)+"，class："+map.get(k).getClass());

            if (FuncUtil.isMap(map.get(k))) {
                System.out.println("=============== " + k + "=============== ");

                HashMap<String, Object> tempMap = (HashMap<String, Object>) map.get(k);

                for (Object k1: tempMap.keySet()) {
                    System.out.println("键："+k1+"，值："+tempMap.get(k1)+"，class："+tempMap.get(k1).getClass());
                }
            }
        }

        System.out.println(ifStr+" ==>  " + eval(ifStr));
        System.out.println(ifConditions+" ==>  " + eval(ifConditions));
        System.out.println(mathStr+" ==>  " + eval(mathStr));
        System.out.println(chineseStr+" ==>  " + eval(chineseStr));
        System.out.println(mapStr+" ==>  " + eval(mapStr));
        System.out.println(timeStr+" ==>  " + eval(timeStr));
    }

    /**
     * 递归获取完整的json对象
     * @param scriptMap
     * @return
     */
    private static HashMap<String, Object> getJsonMap(ScriptObjectMirror scriptMap) {
        HashMap<String, Object> map = new HashMap<>();

        for (String k: scriptMap.keySet()) {
            if (scriptMap.get(k) instanceof ScriptObjectMirror) {
                map.put(k, getJsonMap((ScriptObjectMirror) scriptMap.get(k)));
                continue;
            }

            map.put(k, scriptMap.get(k));
        }

        return map;
    }

    public static Object eval(String exp) {
        Object re = null;

        try {
            Object s = se.eval("("+exp+")");

            System.out.println("getclass：" + s.getClass());

            if (s instanceof Boolean) {
                re = (Boolean) s;
            } else if (s instanceof ScriptObjectMirror) {
                re = getJsonMap((ScriptObjectMirror) s);
            } else if (s instanceof Double) {
                re = FuncUtil.toDecimal(s.toString(), 2);
            } else if (s instanceof String) {
                re = s;
            } else if (s instanceof Map) {
                re = (Map) s;
            } else if (s instanceof List) {
                re = (List) s;
            } else if (s instanceof Integer) {
                re = (Integer) s;
            }

        } catch (ScriptException e) {
            e.printStackTrace();
            return re;
        }

        return re;
    }
}
