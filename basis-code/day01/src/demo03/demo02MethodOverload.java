package demo03;

//方法重载
public class demo02MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,5));
        System.out.println(sum(5,10,15));
    }

    public static int sum(int a, int b) {
        System.out.println("调用两个参数的方法");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("调用三个参数的方法");
        return a + b + c;
    }
}
