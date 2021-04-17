package demo02API;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        //创建一个Random类
        Random rd=new Random();
        int num1= rd.nextInt();
        //随机数0~9
        int num2= rd.nextInt(10);
        System.out.println("newInt():"+num1);
        System.out.println("netInt(10):"+num2);
    }
}
