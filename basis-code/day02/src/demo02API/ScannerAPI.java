package demo02API;

import java.util.Scanner;

public class ScannerAPI {
    public static void main(String[] args) {
        //从键盘输入
        Scanner sc=new Scanner(System.in);
        //输入数字
        int num=sc.nextInt();
        System.out.println("输入的数字是"+num);
    }
}
