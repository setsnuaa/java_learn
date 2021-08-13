package demo03InnerClass;

public class Main {
    public static void main(String[] args) {
        Car.Engine engine=new Car("Mercedes").new Engine("AMG");//创建内部类对象
        System.out.println(engine.getName());
    }
}
