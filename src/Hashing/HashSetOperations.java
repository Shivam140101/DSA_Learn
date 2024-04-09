package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("gfg");
        set.add("courses");
        set.add("ide");

        System.out.println(set);
        System.out.println(set.contains("gfg"));
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            System.out.print(i.next()+" ");

        System.out.println("\n"+set.size());
        set.remove("gfg");
        System.out.println(set.size());
        for (String s : set) System.out.print(s+" ");
        System.out.println("\n"+set.isEmpty());


    }
}
