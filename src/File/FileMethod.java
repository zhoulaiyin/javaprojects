package File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethod {

    public static void main(String[] args) throws IOException {
        //创建方法
        //@SuppressWarnings("unused")
//        File fileMake = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\a.txt");
//        System.out.println("创建成功了吗？"+fileMake.createNewFile());
//        System.out.println("单级文件夹创建成功了吗？"+fileMake.mkdir());
//        System.out.println("多级文件夹创建成功了吗？"+fileMake.mkdirs());
//        File dest = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\c.txt");
//        System.out.println("重命名成功了吗？"+fileMake.renameTo(dest));

        //删除方法
//        File fileDelete = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\c.txt");
//        System.out.println("删除成功了吗？"+fileDelete.delete());
//        fileDelete.deleteOnExit();

        //判断方法
//        File fileHandle = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\newPackage\\a.txt");
//        System.out.println("文件或者文件夹存在吗？"+fileHandle.exists());
//        System.out.println("是一个文件吗？"+fileHandle.isFile());
//        System.out.println("是一个文件夹吗？"+fileHandle.isDirectory());
//        System.out.println("是隐藏文件吗？"+fileHandle.isHidden());
//        System.out.println("此路径是绝对路径名？"+fileHandle.isAbsolute());

        //获取方法
//        File fileRead = new File("D:\\inonesoft\\openresty\\d_java\\MyTest\\src\\File\\testfile.text");
//        System.out.println("文件或者文件夹得名称是："+fileRead.getName());
//        System.out.println("绝对路径是："+fileRead.getPath());
//        System.out.println("绝对路径是："+fileRead.getAbsolutePath());
//        System.out.println("文件大小是（以字节为单位）:"+fileRead.length());
//        System.out.println("父路径是"+fileRead.getParent());
//        //使用日期类与日期格式化类进行获取规定的时间
//        long  lastmodified= fileRead.lastModified();
//        Date data = new Date(lastmodified);
//        SimpleDateFormat simpledataformat = new SimpleDateFormat("YY年MM月DD日 HH:mm:ss");
//        System.out.println("最后一次修改的时间是："+simpledataformat.format(data));

        //文件或者文件夹的方法
        File[] file = File.listRoots();
        System.out.println("所有的盘符是：");
        for(File item : file){
            System.out.println("\t"+item);
        }

        File filename =new File("D:\\inonesoft\\openresty");
        String[] name = filename.list();
        System.out.println("指定文件夹下的文件或者文件夹有：");
        for(String item : name){
            System.out.println("\t"+item);
        }

        File[] f = filename.listFiles();
        System.out.println("获得该路径下的文件或文件夹是：");
        for(File item : f){
            System.out.println("\t"+item.getName());
        }

    }
}
