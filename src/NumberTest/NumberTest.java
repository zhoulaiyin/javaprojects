package NumberTest;

import Common.FuncUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberTest {
    public static void test() {
        double i = 2, j = 2.1, k = 2.5, m = 2.9;

        System.out.println("舍掉小数取整:Math.floor(" + i + ")=" + (int) Math.floor(i));
        System.out.println("舍掉小数取整:Math.floor(" + j + ")=" + (int) Math.floor(j));
        System.out.println("舍掉小数取整:Math.floor(" + k + ")=" + (int) Math.floor(k));
        System.out.println("舍掉小数取整:Math.floor(" + m + ")=" + (int) Math.floor(m));
        System.out.println();

        System.out.println("舍掉小数取整:Math.floor(-" + i + ")=" + (int) Math.floor(-i));
        System.out.println("舍掉小数取整:Math.floor(-" + j + ")=" + (int) Math.floor(-j));
        System.out.println("舍掉小数取整:Math.floor(-" + k + ")=" + (int) Math.floor(-k));
        System.out.println("舍掉小数取整:Math.floor(-" + m + ")=" + (int) Math.floor(-m));
        System.out.println();

        // 这段被注释的代码不能正确的实现四舍五入取整
        System.out.println("四舍五入取整:Math.rint(" + i + ")=" + (int) Math.rint(i));
        System.out.println("四舍五入取整:Math.rint(" + j + ")=" + (int) Math.rint(j));
        System.out.println("四舍五入取整:Math.rint(" + k + ")=" + (int) Math.rint(k));
        System.out.println("四舍五入取整:Math.rint(" + m + ")=" + (int) Math.rint(m));
        System.out.println();

        System.out.println("四舍五入取整:Math.rint(-" + i + ")=" + (int) Math.rint(-i));
        System.out.println("四舍五入取整:Math.rint(-" + j + ")=" + (int) Math.rint(-j));
        System.out.println("四舍五入取整:Math.rint(-" + k + ")=" + (int) Math.rint(-k));
        System.out.println("四舍五入取整:Math.rint(-" + m + ")=" + (int) Math.rint(-m));
        System.out.println();

        System.out.println("DecimalFormat四舍五入取整:(" + i + ")="
                + new DecimalFormat("0").format(i));
        System.out.println("DecimalFormat四舍五入取整:(" + j + ")="
                + new DecimalFormat("0").format(j));
        System.out.println("DecimalFormat四舍五入取整:(" + k + ")="
                + new DecimalFormat("0").format(k));
        System.out.println("DecimalFormat四舍五入取整:(" + m + ")="
                + new DecimalFormat("0").format(m));
        System.out.println();

        System.out.println("DecimalFormat四舍五入取整:(-" + i + ")="
                + new DecimalFormat("0").format(-i));
        System.out.println("DecimalFormat四舍五入取整:(-" + j + ")="
                + new DecimalFormat("0").format(-j));
        System.out.println("DecimalFormat四舍五入取整:(-" + k + ")="
                + new DecimalFormat("0").format(-k));
        System.out.println("DecimalFormat四舍五入取整:(-" + m + ")="
                + new DecimalFormat("0").format(-m));
        System.out.println();

        System.out.println("BigDecimal四舍五入取整:(" + i + ")="
                + new BigDecimal("2").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal四舍五入取整:(" + j + ")="
                + new BigDecimal("2.1").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal四舍五入取整:(" + k + ")="
                + new BigDecimal("2.5").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal四舍五入取整:(" + m + ")="
                + new BigDecimal("2.9").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        System.out.println("BigDecimal四舍五入取整:(-" + i + ")="
                + new BigDecimal("-2").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal四舍五入取整:(-" + j + ")="
                + new BigDecimal("-2.1").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal四舍五入取整:(-" + k + ")="
                + new BigDecimal("-2.5").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal四舍五入取整:(-" + m + ")="
                + new BigDecimal("-2.9").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        System.out.println("凑整:Math.ceil(" + i + ")=" + (int) Math.ceil(i));
        System.out.println("凑整:Math.ceil(" + j + ")=" + (int) Math.ceil(j));
        System.out.println("凑整:Math.ceil(" + k + ")=" + (int) Math.ceil(k));
        System.out.println("凑整:Math.ceil(" + m + ")=" + (int) Math.ceil(m));
        System.out.println();

        System.out.println("凑整:Math.ceil(-" + i + ")=" + (int) Math.ceil(-i));
        System.out.println("凑整:Math.ceil(-" + j + ")=" + (int) Math.ceil(-j));
        System.out.println("凑整:Math.ceil(-" + k + ")=" + (int) Math.ceil(-k));
        System.out.println("凑整:Math.ceil(-" + m + ")=" + (int) Math.ceil(-m));
        System.out.println();

        System.out.println("四舍五入取整:Math.round(" + i + ")=" + (int) Math.round(i));
        System.out.println("四舍五入取整:Math.round(" + j + ")=" + (int) Math.round(j));
        System.out.println("四舍五入取整:Math.round(" + k + ")=" + (int) Math.round(k));
        System.out.println("四舍五入取整:Math.round(" + m + ")=" + (int) Math.round(m));
        System.out.println();

        System.out.println("四舍五入取整:Math.round(-" + i + ")=" + (int) Math.round(-i));
        System.out.println("四舍五入取整:Math.round(-" + j + ")=" + (int) Math.round(-j));
        System.out.println("四舍五入取整:Math.round(-" + k + ")=" + (int) Math.round(-k));
        System.out.println("四舍五入取整:Math.round(-" + m + ")=" + (int) Math.round(-m));
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     * @param v1 被除数
     * @param v2 除数
     * @param scale 表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double divide(Object v1, Object v2, int scale) {
        if (scale < 0) {
            return 0;
        }
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return (b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)).doubleValue();
    }
    public static double divide(Object v1, Object v2) {
        return divide(v1, v2, 2);
    }

    public static void main(String[] args) {
        System.out.println("divide精确：" + divide(765, 13.25));
        System.out.println("toDecimal精确：" + FuncUtil.toDecimal("765.1345", 2));
        System.out.println("BigDecimal精确：" + (new BigDecimal(765.1345).setScale(2,BigDecimal.ROUND_HALF_UP)).doubleValue());
    }
}
