package Parse;

import java.util.ArrayList;
import java.util.HashMap;

public class ExecuteFunc {
    private HashMap<String, Object> DT; //记录生成的数据包
    private HashMap<String, Object> tempDT; //临时节点数据，用于记录嵌套数据包
    private HashMap<String, Object> globalStructre; //全量节点的配置
    private ArrayList Marked; //标记已经处理的前台节点父节点

//    public HashMap<String, Object> handle() {
//        HashMap<String, Object> config = new HashMap<>(); //字段赋值配置
//
//        for (String uid: config.keySet()) {
//            Object key_alias = "";
//            Object key_val = null;
//
//            //通过当前节点的pid与rootID进行对比可知晓
//            if (如果为根节点（第一层的节点）) {
//                DT.put(key_alias, assign(config.get(uid), null));
//                continue;
//            }
//
//            upHandle(config.get("pid"));
//        }
//    }
//
//    //单个属性赋值解析
//    public Object assign(HashMap<String, Object> config, Integer sub_index) {
//        //返回解析值
//    }
//
//    //跳跃到上一层进行处理
//    public void upHandle(Object pid) {
//        //获取当前pid的配置
//        HashMap cur_pid_config = new HashMap();
//
//        //获取pid配置
//        HashMap parent_config = (HashMap) globalStructre.get(cur_pid_config.get("pid"));
//
//        //已经处理的节点无需处理
//        if (parent_config.get("uid") 已经存在 Marked 内) {
//            upHandle(parent_config.get("pid"));
//        }
//
//        HashMap childs = (HashMap) parent_config.get("childs");
//
//        //将当前节点所处的同级别节点全部处理完毕
//        Object key_new_val = nestHandle(parent_config.get("uid"), childs, pid);
//
//        //通过当前节点的pid与rootID进行对比可知晓
//        if (如果为根节点（第一层的节点）) {
//            DT.put(key_alias, assign(config.get(uid), null));
//            return;
//        }
//
//        HashMap<String, Object> newTempDT = new HashMap<>();
//
//        newTempDT.put(cur_pid_config.get("alias"), key_new_val);
//
//        //更新临时数据包
//        tempDT = newTempDT;
//
//        Marked.add(pid); //记录当前处理的字段节点
//
//        //继续往上一层处理
//        upHandle(parent_config.get("pid"));
//    }
//
//    //处理嵌套结构，向下递归处理
//    public Object nestHandle(Object pConfig, HashMap childs, String filterId) {
//        HashMap nestMap = new HashMap();
//
//        //检查childs里面有用到数组取值
//
//        if ("存在数组取值") {
//            //获取取值数组数据
//
//            //如果pConfig为对象，循环每个子节点进行解析，则利用取值数据第一条数据解析
//
//            //如果pConfig为数组，循环每个子节点进行解析，则循环所有行数据，生成pdata
//
//            return new HashMap<>();
//        }
//
//        //如果pConfig为对象，循环每个子节点进行解析
//
//        //如果pConfig为数组，循环每个子节点进行解析，生成pdata，作为pConfig的一条数据
//
//        //在循环每个子节点进行解析的过程中，如果某个节点存在子节点，则递归调用nestHandle
//
//        return new HashMap<>();
//    }
}
