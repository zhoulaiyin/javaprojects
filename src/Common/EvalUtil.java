package Common;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalUtil {
    //精确小数点
    public static Double toDecimal(String num, int precision) {
        return (new BigDecimal(num).setScale(precision, BigDecimal.ROUND_HALF_UP)).doubleValue();
    }

    //判断表达式是否为特殊格式
    public static boolean isSpecial(String exp) {
        return FuncUtil.isDateTime(exp) || FuncUtil.isDate(exp);
    }

    public static Object eval(String exp) {
        if (isSpecial(exp)) {
            return exp;
        }

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        Object re = null;

        try {
            Object s = se.eval("("+exp+")");

            if (s instanceof Boolean) {
                re = (Boolean) s;
            } else if (s instanceof ScriptObjectMirror) {
                HashMap<String, Object> javaMap = new HashMap<>();
                ScriptObjectMirror scriptMap = (ScriptObjectMirror) s;

                for (String k: scriptMap.keySet()) {
                    javaMap.put(k, scriptMap.get(k));
                }

                re = javaMap;
            } else if (s instanceof Double) {
                re = toDecimal(s.toString(), 2);
            } else if (s instanceof String) {
                re = s;
            } else if (s instanceof Map) {
                re = (Map) s;
            } else if (s instanceof List) {
                re = (List) s;
            } else if (s instanceof Integer) {
                re = (Integer) s;
            } else if (s instanceof Long) {
                re = (Long) s;
            } else if (s instanceof Float) {
                re = (Float) s;
            } else {
                throw new SecurityException("没有找到符合的解析类型：" + s.getClass());
            }

        } catch (ScriptException e) {
            e.printStackTrace();

            return re;
        }

        return re;
    }

}
