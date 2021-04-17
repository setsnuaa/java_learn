package demo01Class;

public class StudentUse {
    public static void main(String[] args) {
        //无参构造
        Student stu1=new Student();
        stu1.setName("Stark");
        stu1.setAge(25);
        //含参构造
        Student stu2=new Student("Tony",22);
        System.out.println(stu2);
        //匿名对象
        System.out.println(new Student("Thor",28));
    }
}
