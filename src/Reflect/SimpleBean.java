package Reflect;

import java.util.HashMap;

public class SimpleBean {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String method(HashMap<String,Object> args) {
        System.out.println("接收参数：" + args);

        return args.toString();
    }

    public String method(HashMap<String,Object> args, String apiName) {
        System.out.println("接收参数：" + args);

        return apiName + "=======" + args.toString();
    }

    public String method(String apiName) {
        System.out.println("apiName：" + apiName);

        return apiName;
    }
}
