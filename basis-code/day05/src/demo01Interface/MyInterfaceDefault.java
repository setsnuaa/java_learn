package demo01Interface;

public interface MyInterfaceDefault {
    void methodPrint();
    default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
