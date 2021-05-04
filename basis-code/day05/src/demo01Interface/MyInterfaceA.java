package demo01Interface;

public class MyInterfaceA implements MyInterfaceDefault{
    @Override
    public void methodPrint() {
        System.out.println("实现了抽象方法，A");
    }
}
