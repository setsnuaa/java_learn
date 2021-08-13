package demoCollection;
import java.util.Collection;
import java.util.ArrayList;
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll=new ArrayList<>();
        //添加元素
        coll.add("Tony");
        System.out.println("添加后："+coll);
        //删除元素
        coll.remove("Tony");
        System.out.println("删除后："+coll);
    }
}
