package NumberTest;

import Common.FuncUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberTest {
    public static void test() {
        double i = 2, j = 2.1, k = 2.5, m = 2.9;

        System.out.println("���С��ȡ��:Math.floor(" + i + ")=" + (int) Math.floor(i));
        System.out.println("���С��ȡ��:Math.floor(" + j + ")=" + (int) Math.floor(j));
        System.out.println("���С��ȡ��:Math.floor(" + k + ")=" + (int) Math.floor(k));
        System.out.println("���С��ȡ��:Math.floor(" + m + ")=" + (int) Math.floor(m));
        System.out.println();

        System.out.println("���С��ȡ��:Math.floor(-" + i + ")=" + (int) Math.floor(-i));
        System.out.println("���С��ȡ��:Math.floor(-" + j + ")=" + (int) Math.floor(-j));
        System.out.println("���С��ȡ��:Math.floor(-" + k + ")=" + (int) Math.floor(-k));
        System.out.println("���С��ȡ��:Math.floor(-" + m + ")=" + (int) Math.floor(-m));
        System.out.println();

        // ��α�ע�͵Ĵ��벻����ȷ��ʵ����������ȡ��
        System.out.println("��������ȡ��:Math.rint(" + i + ")=" + (int) Math.rint(i));
        System.out.println("��������ȡ��:Math.rint(" + j + ")=" + (int) Math.rint(j));
        System.out.println("��������ȡ��:Math.rint(" + k + ")=" + (int) Math.rint(k));
        System.out.println("��������ȡ��:Math.rint(" + m + ")=" + (int) Math.rint(m));
        System.out.println();

        System.out.println("��������ȡ��:Math.rint(-" + i + ")=" + (int) Math.rint(-i));
        System.out.println("��������ȡ��:Math.rint(-" + j + ")=" + (int) Math.rint(-j));
        System.out.println("��������ȡ��:Math.rint(-" + k + ")=" + (int) Math.rint(-k));
        System.out.println("��������ȡ��:Math.rint(-" + m + ")=" + (int) Math.rint(-m));
        System.out.println();

        System.out.println("DecimalFormat��������ȡ��:(" + i + ")="
                + new DecimalFormat("0").format(i));
        System.out.println("DecimalFormat��������ȡ��:(" + j + ")="
                + new DecimalFormat("0").format(j));
        System.out.println("DecimalFormat��������ȡ��:(" + k + ")="
                + new DecimalFormat("0").format(k));
        System.out.println("DecimalFormat��������ȡ��:(" + m + ")="
                + new DecimalFormat("0").format(m));
        System.out.println();

        System.out.println("DecimalFormat��������ȡ��:(-" + i + ")="
                + new DecimalFormat("0").format(-i));
        System.out.println("DecimalFormat��������ȡ��:(-" + j + ")="
                + new DecimalFormat("0").format(-j));
        System.out.println("DecimalFormat��������ȡ��:(-" + k + ")="
                + new DecimalFormat("0").format(-k));
        System.out.println("DecimalFormat��������ȡ��:(-" + m + ")="
                + new DecimalFormat("0").format(-m));
        System.out.println();

        System.out.println("BigDecimal��������ȡ��:(" + i + ")="
                + new BigDecimal("2").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal��������ȡ��:(" + j + ")="
                + new BigDecimal("2.1").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal��������ȡ��:(" + k + ")="
                + new BigDecimal("2.5").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal��������ȡ��:(" + m + ")="
                + new BigDecimal("2.9").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        System.out.println("BigDecimal��������ȡ��:(-" + i + ")="
                + new BigDecimal("-2").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal��������ȡ��:(-" + j + ")="
                + new BigDecimal("-2.1").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal��������ȡ��:(-" + k + ")="
                + new BigDecimal("-2.5").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal��������ȡ��:(-" + m + ")="
                + new BigDecimal("-2.9").setScale(0, BigDecimal.ROUND_HALF_UP));
        System.out.println();

        System.out.println("����:Math.ceil(" + i + ")=" + (int) Math.ceil(i));
        System.out.println("����:Math.ceil(" + j + ")=" + (int) Math.ceil(j));
        System.out.println("����:Math.ceil(" + k + ")=" + (int) Math.ceil(k));
        System.out.println("����:Math.ceil(" + m + ")=" + (int) Math.ceil(m));
        System.out.println();

        System.out.println("����:Math.ceil(-" + i + ")=" + (int) Math.ceil(-i));
        System.out.println("����:Math.ceil(-" + j + ")=" + (int) Math.ceil(-j));
        System.out.println("����:Math.ceil(-" + k + ")=" + (int) Math.ceil(-k));
        System.out.println("����:Math.ceil(-" + m + ")=" + (int) Math.ceil(-m));
        System.out.println();

        System.out.println("��������ȡ��:Math.round(" + i + ")=" + (int) Math.round(i));
        System.out.println("��������ȡ��:Math.round(" + j + ")=" + (int) Math.round(j));
        System.out.println("��������ȡ��:Math.round(" + k + ")=" + (int) Math.round(k));
        System.out.println("��������ȡ��:Math.round(" + m + ")=" + (int) Math.round(m));
        System.out.println();

        System.out.println("��������ȡ��:Math.round(-" + i + ")=" + (int) Math.round(-i));
        System.out.println("��������ȡ��:Math.round(-" + j + ")=" + (int) Math.round(-j));
        System.out.println("��������ȡ��:Math.round(-" + k + ")=" + (int) Math.round(-k));
        System.out.println("��������ȡ��:Math.round(-" + m + ")=" + (int) Math.round(-m));
    }

    /**
     * �ṩ����ԣ���ȷ�ĳ������㡣�����������������ʱ����scale����ָ
     * �����ȣ��Ժ�������������롣
     * @param v1 ������
     * @param v2 ����
     * @param scale ��ʾ��Ҫ��ȷ��С�����Ժ�λ��
     * @return ������������
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
        System.out.println("divide��ȷ��" + divide(765, 13.25));
        System.out.println("toDecimal��ȷ��" + FuncUtil.toDecimal("765.1345", 2));
        System.out.println("BigDecimal��ȷ��" + (new BigDecimal(765.1345).setScale(2,BigDecimal.ROUND_HALF_UP)).doubleValue());
    }
}
