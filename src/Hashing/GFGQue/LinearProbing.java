package Hashing.GFGQue;

import java.util.Arrays;

public class LinearProbing {

    public static int[] linear(int[] arr , int hashSize , int n){

        int[] res = new int[hashSize];
        Arrays.fill(res,-1);
        for (int x: arr) {
            int pos = x % hashSize;
            if (res[pos] == 1) res[pos] = x;
            else if(res[pos] == x) continue;
            else{
                int i = (pos+1) % hashSize;
                while(i != pos){
                    int z = res[i];
                    if (z == x) break;
                    else if(z == -1){
                        res[i] = x;
                        break;
                    }
                    i = (i+1) % hashSize;
                }
                if (i == pos) break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {44,45,79,55,91,18,63};
        int[] linear = linear(arr, 7, arr.length);
        System.out.println(Arrays.toString(linear));
    }
}
