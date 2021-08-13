package demo03InnerClass;

public class Car {
    public String name;
    public Car(String name){
        this.name=name;
    }
    public class Engine{
        String name;
        public Engine(String name){
            this.name=name;
        }

        public String getName() {
            return Car.this.name+" "+name;//用外部类名称.this.成员变量访问外部类的成员变量
        }
    }
}
