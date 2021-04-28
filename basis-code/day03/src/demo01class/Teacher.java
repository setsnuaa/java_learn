package demo01class;

public class Teacher extends Employee{
    int num=20;
    public void printNum(){
        System.out.println("子类的num："+num);
        System.out.println("子类的num："+this.num);
        System.out.println("父类的num："+super.num);
    }
}
