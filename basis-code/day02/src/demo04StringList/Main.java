package demo04StringList;

public class Main {
    public static void main(String[] args) {
        //空参构造
        String str1=new String();
        System.out.println(str1);
        //根据字符数组创建
        char[] charArray={'a','b','c'};
        String str2=new String(charArray);
        System.out.println(str2);
        //根据字节数组创建
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println(str3);
        //直接创建
        String str4="abc";
        System.out.println(str4==str3);//false 比较的是地址值
        System.out.println(str4.equals(str3));//true 比较的是内容

        //获取
        System.out.println(str2.length());//长度
        System.out.println(str2.charAt(0));//index所在字符
        System.out.println(str2.indexOf('a'));//字符所在index
        System.out.println(str2.concat("def"));//拼接
        System.out.println(str2);//使用concat后本身不会改变 str2仍然为abc

        //切分
        String str5="aaa,bbb,ccc";
        String[] strSplit=str5.split(",");
        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i]);
        }
    }
}
