package demo05ArrayReturn;

public class ArrayReturn {
    public static void main(String[] args) {
        int[] array=arrayTest();
        System.out.println("array的地址是："+array);
    }

    public static int[] arrayTest(){
        int[] res={1,2,3};
        System.out.println("res的地址是："+res);
        return res;
    }
}
