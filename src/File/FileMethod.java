package File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethod {

    public static void main(String[] args) throws IOException {
        //��������
        //@SuppressWarnings("unused")
//        File fileMake = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\a.txt");
//        System.out.println("�����ɹ�����"+fileMake.createNewFile());
//        System.out.println("�����ļ��д����ɹ�����"+fileMake.mkdir());
//        System.out.println("�༶�ļ��д����ɹ�����"+fileMake.mkdirs());
//        File dest = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\c.txt");
//        System.out.println("�������ɹ�����"+fileMake.renameTo(dest));

        //ɾ������
//        File fileDelete = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\c.txt");
//        System.out.println("ɾ���ɹ�����"+fileDelete.delete());
//        fileDelete.deleteOnExit();

        //�жϷ���
//        File fileHandle = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\a.txt");
//        System.out.println("�ļ������ļ��д�����"+fileHandle.exists());
//        System.out.println("��һ���ļ���"+fileHandle.isFile());
//        System.out.println("��һ���ļ�����"+fileHandle.isDirectory());
//        System.out.println("�������ļ���"+fileHandle.isHidden());
//        System.out.println("��·���Ǿ���·������"+fileHandle.isAbsolute());

        //��ȡ����
//        File fileRead = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\testfile.text");
//        System.out.println("�ļ������ļ��е������ǣ�"+fileRead.getName());
//        System.out.println("����·���ǣ�"+fileRead.getPath());
//        System.out.println("����·���ǣ�"+fileRead.getAbsolutePath());
//        System.out.println("�ļ���С�ǣ����ֽ�Ϊ��λ��:"+fileRead.length());
//        System.out.println("��·����"+fileRead.getParent());
//        //ʹ�������������ڸ�ʽ������л�ȡ�涨��ʱ��
//        long  lastmodified= fileRead.lastModified();
//        Date data = new Date(lastmodified);
//        SimpleDateFormat simpledataformat = new SimpleDateFormat("YY��MM��DD�� HH:mm:ss");
//        System.out.println("���һ���޸ĵ�ʱ���ǣ�"+simpledataformat.format(data));

        //�ļ������ļ��еķ���
        File[] file = File.listRoots();
        System.out.println("���е��̷��ǣ�");
        for(File item : file){
            System.out.println("\t"+item);
        }

        File filename =new File("D:\\inonesoft\\openresty");
        String[] name = filename.list();
        System.out.println("ָ���ļ����µ��ļ������ļ����У�");
        for(String item : name){
            System.out.println("\t"+item);
        }

        File[] f = filename.listFiles();
        System.out.println("��ø�·���µ��ļ����ļ����ǣ�");
        for(File item : f){
            System.out.println("\t"+item.getName());
        }

    }
}
