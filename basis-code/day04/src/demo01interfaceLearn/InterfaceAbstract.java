package demo01interfaceLearn;

public interface InterfaceAbstract {
    void eat();
    default void sleep(){
        //default在子类中可以不重写
        System.out.println("睡觉");
    }
}
