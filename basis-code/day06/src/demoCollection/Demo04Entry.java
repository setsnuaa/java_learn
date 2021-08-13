//使用Entry遍历Map
package demoCollection;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
public class Demo04Entry {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("tony",22);
        map.put("andrew",21);
        for(var entry:map.entrySet()){
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
    }
}
