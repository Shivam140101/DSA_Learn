package Hashing.GFGQue;

import java.util.Arrays;

public class QuadraticProbing {

    public static void quadraticProbing(int[] hash , int hashSize , int[] arr , int n){

        Arrays.fill(hash,-1);
        for (int i = 0 ; i < n ; i++){
            int p = arr[i] % hashSize;
            int j = 1;

            while (hash[p] != -1){
                if (arr[i] == hash[p]) break;
                p = ((arr[i] % hashSize) + (j*j)) % hashSize;

                j++;
            }
            if (hash[p] == -1) hash[p] = arr[i];
        }
        print(hash);
    }

    public static void print(int[] arr){

        for (int i: arr)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {

        int[] arr = {21,10,32,43};
        int n = arr.length;

        int hashSize = 11;
        int[] hash = new int[hashSize];

        quadraticProbing(hash,hashSize,arr,n);


    }
}
