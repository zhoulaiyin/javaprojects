package Collection;

//import org.springframework.util.DigestUtils;
import java.util.*;

public class CollectionsTest {
    /**
     * ����ǩ��
     * @param params //�ӿ��������
     * @param appsecret //��Կ
     * @return
     */
    public String signature(HashMap<String, String> params, String appsecret) {
        String str = "";
        List<String> aList = new ArrayList<>();

        for(Map.Entry<String,String> entry: params.entrySet()) {
            aList.add(entry.getKey());
        }

        //����ֵ����
        Collections.sort(aList);

        //ƴ�Ӽ�ֵ
        for(String k: aList){
            str += k + params.get(k);
        }

        //���ַ�������ƴ��appsecret
        str = appsecret + str + appsecret;

        //���Ĳ�����md5���ܲ�ת���ɴ�д
        //return (DigestUtils.md5DigestAsHex(str.getBytes())).toUpperCase();

        return "";
    }

    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(8);
        nums.add(-3);
        nums.add(2);
        nums.add(9);
        nums.add(-2);

        System.out.println("�����Ƿ�Ϊ�գ�" + nums.isEmpty());

        System.out.println("Ĭ��˳��" + nums);
        Collections.reverse(nums);
        System.out.println("��ת��˳��" + nums);

        Collections.sort(nums);
        System.out.println("�����˳��" + nums);

        Collections.shuffle(nums);
        System.out.println("������˳��" + nums);

        // ����ֻ��Ϊ����ʾ����������÷�����int����ת��string���бȽ�
        Collections.sort(nums, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                return s1.compareTo(s2);
            }

        });

        System.out.println("ָ�������˳��" + nums);
        System.out.println("����ֵ�ǣ�" + Collections.max(nums));
        System.out.println("��С��ֵ�ǣ�" + Collections.min(nums));
    }
}
