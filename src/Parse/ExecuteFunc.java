package Parse;

import java.util.ArrayList;
import java.util.HashMap;

public class ExecuteFunc {
    private HashMap<String, Object> DT; //��¼���ɵ����ݰ�
    private HashMap<String, Object> tempDT; //��ʱ�ڵ����ݣ����ڼ�¼Ƕ�����ݰ�
    private HashMap<String, Object> globalStructre; //ȫ���ڵ������
    private ArrayList Marked; //����Ѿ������ǰ̨�ڵ㸸�ڵ�

//    public HashMap<String, Object> handle() {
//        HashMap<String, Object> config = new HashMap<>(); //�ֶθ�ֵ����
//
//        for (String uid: config.keySet()) {
//            Object key_alias = "";
//            Object key_val = null;
//
//            //ͨ����ǰ�ڵ��pid��rootID���жԱȿ�֪��
//            if (���Ϊ���ڵ㣨��һ��Ľڵ㣩) {
//                DT.put(key_alias, assign(config.get(uid), null));
//                continue;
//            }
//
//            upHandle(config.get("pid"));
//        }
//    }
//
//    //�������Ը�ֵ����
//    public Object assign(HashMap<String, Object> config, Integer sub_index) {
//        //���ؽ���ֵ
//    }
//
//    //��Ծ����һ����д���
//    public void upHandle(Object pid) {
//        //��ȡ��ǰpid������
//        HashMap cur_pid_config = new HashMap();
//
//        //��ȡpid����
//        HashMap parent_config = (HashMap) globalStructre.get(cur_pid_config.get("pid"));
//
//        //�Ѿ�����Ľڵ����账��
//        if (parent_config.get("uid") �Ѿ����� Marked ��) {
//            upHandle(parent_config.get("pid"));
//        }
//
//        HashMap childs = (HashMap) parent_config.get("childs");
//
//        //����ǰ�ڵ�������ͬ����ڵ�ȫ���������
//        Object key_new_val = nestHandle(parent_config.get("uid"), childs, pid);
//
//        //ͨ����ǰ�ڵ��pid��rootID���жԱȿ�֪��
//        if (���Ϊ���ڵ㣨��һ��Ľڵ㣩) {
//            DT.put(key_alias, assign(config.get(uid), null));
//            return;
//        }
//
//        HashMap<String, Object> newTempDT = new HashMap<>();
//
//        newTempDT.put(cur_pid_config.get("alias"), key_new_val);
//
//        //������ʱ���ݰ�
//        tempDT = newTempDT;
//
//        Marked.add(pid); //��¼��ǰ������ֶνڵ�
//
//        //��������һ�㴦��
//        upHandle(parent_config.get("pid"));
//    }
//
//    //����Ƕ�׽ṹ�����µݹ鴦��
//    public Object nestHandle(Object pConfig, HashMap childs, String filterId) {
//        HashMap nestMap = new HashMap();
//
//        //���childs�������õ�����ȡֵ
//
//        if ("��������ȡֵ") {
//            //��ȡȡֵ��������
//
//            //���pConfigΪ����ѭ��ÿ���ӽڵ���н�����������ȡֵ���ݵ�һ�����ݽ���
//
//            //���pConfigΪ���飬ѭ��ÿ���ӽڵ���н�������ѭ�����������ݣ�����pdata
//
//            return new HashMap<>();
//        }
//
//        //���pConfigΪ����ѭ��ÿ���ӽڵ���н���
//
//        //���pConfigΪ���飬ѭ��ÿ���ӽڵ���н���������pdata����ΪpConfig��һ������
//
//        //��ѭ��ÿ���ӽڵ���н����Ĺ����У����ĳ���ڵ�����ӽڵ㣬��ݹ����nestHandle
//
//        return new HashMap<>();
//    }
}
