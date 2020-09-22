package LinkedList;

import java.util.*;

public class ArrayListTest {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        System.out.println("al-->" + al);

        //����һ�����ɱ��޸ĵļ���
        List<String> unmodifiableList = Collections.unmodifiableList(al);
        unmodifiableList.add("d");

        for (int i=0; i<al.size(); i++) {
            System.out.println("ѭ��:"+i+"-->" + al.get(i));
        }

        //ͨ������������
        Iterator ite = al.iterator();
        while (ite.hasNext()) {
            System.out.println("Iterator--value-->" + ite.next());
        }

        System.out.println("al.toString()-->" + al.toString() + " ��length-->" + al.toString().length());

        String[] alToArr = al.toArray(new String[al.size()]);

        for (int i=0; i<alToArr.length; i++) {
            System.out.println(i+"-->" + alToArr[i]);
        }

    }
}
