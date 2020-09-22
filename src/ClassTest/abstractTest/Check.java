package ClassTest.abstractTest;

import java.util.HashMap;

public class Check extends BaseAbstract{
    public HashMap<String,Object> execute() {
        return new HashMap<>();
    }

    @Override
    public HashMap<String,Object> upload() {
        HashMap rtn = new HashMap();
        rtn.put("name", 123);

        return rtn;
    }

    public static void main(String[] arags) {
        Check check = new Check();

        check.check();

        System.out.println("upload-->" + check.upload());

        System.out.println("calName-->" + check.calName);
    }
}
