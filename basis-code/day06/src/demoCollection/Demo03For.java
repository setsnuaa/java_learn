package demoCollection;
import java.util.Collection;
import java.util.ArrayList;

public class Demo03For {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("Tony");
        collection.add("Jack");
        collection.add("Ivery");
        for(String str:collection){
            System.out.println(str);
        }
    }
}
