package StringTest;

public class StringMethod {
    public void replace() {
        String str = "Hello World";
        System.out.println( str.replace( 'H','W' ) );
        System.out.println( str.replaceFirst("He", "Wa") );
        System.out.println( str.replaceAll("He", "Ha") );
    }

    public void split() {
        String str = "www-runoob-com";
        String[] temp;
        String delimeter = "-";
        temp = str.split(delimeter);

        for(int i =0; i < temp.length ; i++){
            System.out.println(temp[i]);
            System.out.println("");
        }

        System.out.println("------java for each-----");
        String str1 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\.";
        temp1 = str1.split(delimeter1);
        for(String x :  temp1){
            System.out.println(x);
            System.out.println("");
        }
    }

    public void Concate() {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            String result = "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("+拼接耗时: " + (endTime - startTime)+ " ms");

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("StringBuffer耗时: " + (endTime1 - startTime1)+ " ms");
    }

    public void find() {
        String strOrig = "Hello world ,Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if(lastIndex == - 1){
            System.out.println("没有发现 Runoob");
        }else{
            System.out.println("Runoob 找到的位置索引： "+ lastIndex);
        }
    }
}
