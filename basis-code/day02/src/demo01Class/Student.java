package demo01Class;
//构造方法
public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("执行无参构造");
    }
    public Student(String name,int age){
        System.out.println("执行含参构造");
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return name+","+age;
    }
}
