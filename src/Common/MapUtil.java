package Common;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class MapUtil {

    /**
     * 深度拷贝
     * @param obj
     * @return
     */
    public static HashMap deepClone(HashMap obj){
        HashMap clonedObj = new HashMap();
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
