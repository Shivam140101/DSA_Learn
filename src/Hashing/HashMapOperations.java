package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("gfg",10);
        map.put("course",15);
        //map.put("gfg",20);
        map.put("ide",20);
        map.put("Me", 25);

        System.out.println(map);
        System.out.println(map.size());
        for (String key : map.keySet()) {
            System.out.print(key+" ");
        }
        System.out.println();
        for (Integer value : map.values()) {
            System.out.print(value+" ");
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        if (map.containsKey("ide"))
            System.out.println("Yes");
        else System.out.println("No");
        System.out.println(map.remove("ide")+" is removed");
        System.out.println(map.size());

        if (map.containsValue(25))
            System.out.println("Yes");
        else System.out.println("No");
        System.out.println(map.get("gfg"));
        System.out.println(map.get("practice"));




    }
}
