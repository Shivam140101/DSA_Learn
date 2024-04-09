package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Operations {
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    Operations(int b){
        bucket = b;
        table = new ArrayList<>();
        for (int i = 0 ; i < b;i++)
            table.add(new LinkedList<Integer>());
    }

    void insert(int key){
        int i = key % bucket;
        table.get(i).add(key);
    }

    void remove(int key){
        int i = key % bucket;
        table.get(i).remove((Integer) i);
        System.out.println(((Integer)i)+" is deleted from table");
    }

    boolean search(int key){
        int i = key % bucket;
        return table.get(i).contains(key);
    }

    void printTable(){
        for(int i= 0 ; i < bucket ; i++){
            if (table.isEmpty()) continue;
            System.out.print(i + "->");
            for (int v: table.get(i)){
                System.out.print(v + "->");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int hashSize = 7;
        int[] arr = {70,71,9,56,72};

        Operations op = new Operations(hashSize);
        for (int j : arr) op.insert(j);
        op.printTable();

        boolean search = op.search(57);
        System.out.println(search);

        op.remove(56);


        boolean search1 = op.search(56);
        System.out.println(search1);



    }

}
