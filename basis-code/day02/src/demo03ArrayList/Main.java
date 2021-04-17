package demo03ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList=new ArrayList<>();
        //添加数据
        stringList.add("Tony");
        stringList.add("Thor");
        System.out.println(stringList);
        System.out.println("get(1):"+stringList.get(1));
    }
}
