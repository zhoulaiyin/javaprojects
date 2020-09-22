package ClassTest.abstractTest;

import java.util.HashMap;

public abstract class BaseAbstract {
    public String calName = "AbstractClass";

    public abstract HashMap<String,Object> execute();

    public HashMap<String,Object> upload() {
        HashMap rtn = new HashMap();
        rtn.put("pid", "-1");
        rtn.put("name", "BaseAbstract");

        return rtn;
    }

    public void check() {
        System.out.println("BaseAbstract public void check");
    }
}
