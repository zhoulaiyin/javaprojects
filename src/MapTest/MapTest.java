package MapTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        f1();
    }

    public static void f1() {
        HashMap<String,Object> Obj = new HashMap<>();

        HashMap<String,Object> a = new HashMap<>();
        a.put("name", "zly");
        a.put("age", 30);

        HashMap<String,Object> b = new HashMap<>();
        b.put("name", "lilei");
        b.put("age", 28);

        Obj.put("age", 35);
        Obj.put("id_1", a);
        Obj.put("id_2", b);

        for (int i=0; i<=1; i++) {
            System.out.println("index --->" + i);
            System.out.println("start ---> Obj" + Obj);
            Object re = handle(Obj, i);
            System.out.println("over ---> Obj" + Obj);
        }

        System.out.println("==========");
        System.out.println("==========");
        System.out.println("last --->" + Obj);
    }

    public static Object handle(HashMap<String,Object> o, int index) {
        HashMap<String,Object> temp = new HashMap<>();
        temp.putAll(o);

//        HashMap<String,Object> temp = o;

//        HashMap<String,Object> temp = deepClone(o);

        switch (index) {
            case 0:
                temp.put("age", 25);
                HashMap<String,Object> a = (HashMap) temp.get("id_1");
                a.put("school", "qinghua");
                break;

            case 1:
                temp.put("age", 45);
                HashMap<String,Object> b = (HashMap) temp.get("id_2");
                b.put("school", "beida");
                break;
        }

        System.out.println(index+"--- inner --->" + temp);

        return temp;
    }

    public static HashMap deepClone(HashMap obj){
        HashMap clonedObj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            clonedObj = (HashMap) ois.readObject();
            ois.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return clonedObj;
    }
}
