package demo01Interface;

public class Main {
    public static void main(String[] args) {

        //default方法
        MyInterfaceA a=new MyInterfaceA();
        MyInterfaceB b=new MyInterfaceB();
        a.methodPrint();
        a.methodDefault();
        b.methodPrint();
        b.methodDefault();
        System.out.println("=================");

        //static方法
        //不能通过接口实现类的对象来调用接口当中的静态方法
        //通过接口名称，直接调用它的静态方法
        MyInterfaceStatic.methodPrint();
        System.out.println("=================");

        //private方法

    }
}
