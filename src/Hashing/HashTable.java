package Hashing;


import java.util.Arrays;

class HashNode {
    int key;
    int value;

    HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


public class HashTable {

    private static final int capacity = 20;
    private  int size = 0;
    private final HashNode[] arr;
    private final HashNode dummy;

    public HashTable(){
        arr = new HashNode[capacity];
        Arrays.fill(arr,null);
        dummy = new HashNode(-1,-1);
    }

    private int hashFunction(int key) {
        return key % capacity;
    }

    public void insert(int key, int value) {

        HashNode temp = new HashNode(key,value);
        int hashIndex = hashFunction(key);

        while (arr[hashIndex] != null && arr[hashIndex].key != key && arr[hashIndex].key != -1 )
            hashIndex = (hashIndex + 1) % capacity;
        if (arr[hashIndex] == null || arr[hashIndex].key == -1)
            size++;
        arr[hashIndex] = temp;
    }

    public int find(int key){

        int hashIndex = hashFunction(key);
        int count = 0;

        while(arr[hashIndex] != null){
            if (count++ > capacity) break;
            if (arr[hashIndex].key == key) return arr[hashIndex].value;
            hashIndex = (hashIndex + 1) % capacity;
        }
        return -1;
    }

    public int delete(int key){

        int hashIndex = hashFunction(key);
        int count = 0;

        while (arr[hashIndex] != null){
            if (count++ > capacity) break;
            if (arr[hashIndex].key == key) {
                arr[hashIndex] = dummy;
                size--;
                return 1;
            }
            hashIndex = (hashIndex + 1) % capacity;
        }
        return 0;
    }

    public static void main(String[] args) {

        HashTable hash = new HashTable();

        hash.insert(1,5);
        hash.insert(2,15);
        hash.insert(3,20);
        hash.insert(4,7);

        if (hash.find(4) != -1)
            System.out.println("Value of Key 4 = " + hash.find(4));
        else
            System.out.println("Key 4 does not exist");

        if (hash.delete(4) == 1)
            System.out.println("Value of Key 4 is deleted = " + hash.delete(4));
        else
            System.out.println("The key does not exist");

        if (hash.find(4) != -1)
            System.out.println("Value of Key 4 = " + hash.find(4));
        else
            System.out.println("Key 4 does not exist");
    }
}
