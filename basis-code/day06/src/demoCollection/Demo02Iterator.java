package demoCollection;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("Tony");
        collection.add("Jack");
        collection.add("Ivery");
        //获取迭代器
        Iterator<String> iterator = collection.iterator();
        //判断是否有元素
        System.out.println(iterator.hasNext());
        //取出元素
        String str1=iterator.next();
        String str2=iterator.next();
        System.out.println("第一个元素："+str1+"\n第二个元素："+str2);
    }
}
