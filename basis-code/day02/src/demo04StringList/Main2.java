package demo04StringList;

import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) {
        String str1="hello";
        char[] charArray=str1.toCharArray();//将字符串拆分成字符数组
        byte[] byteArray=str1.getBytes(StandardCharsets.UTF_8);//获得字符串底层的字节数组
        String newStr=str1.replace("ll","rr");

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
        System.out.println("newStr:"+newStr);
    }
}
