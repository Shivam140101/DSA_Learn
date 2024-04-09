package Searching.SearchInInfiniteSortedArray;

public class NaiveSolution {

    // Time Complexity = O(Log p)
    public static int search(int[] arr , int n , int x){
        int i=0;
        while(true){
            if (arr[i] == x) return i;
            if (arr[i] > x) return -1;
            i++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,10,20,30,40,50,70,100,200,300,500,600,700,800,900,1000,
                     1100,1200,1300,1400,1500,1600,1700,1800,1900,2000,2100,2200,2300,2400,
                     2500,2600,2700,2800,2900,3000};

        int search = search(arr, arr.length, 100);
        System.out.println(search);
    }
}
