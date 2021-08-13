package baoZhuangLei;

public class demo01Integer {
    public static void main(String[] args) {
        //装箱
        //构造方法
//        Integer int1 = new Integer(1);
//        System.out.println(int1);
//        Integer int2 = new Integer("2");//红线表示已过时
//        System.out.println(int2);
        //静态方法
        Integer int3 = Integer.valueOf(3);
        System.out.println(int3);
        Integer int4 = Integer.valueOf("4");
        System.out.println(int4);

        //拆箱
        int int5=int3.intValue();
        System.out.println(int5);

        //自动装箱、拆箱
        Integer int11=4;
        int11=int11+4;
        System.out.println(int11);
    }
}
