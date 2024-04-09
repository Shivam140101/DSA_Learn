package Searching.MedianOfTwoSortedArrays;

public class EfficientSolution {


    // Time Complexity = O(N)
    public static double getMedian(int[] arr1 , int[] arr2 , int n1 , int n2){
        int[] temp = new int[n1 + n2];

        int i=0 , j=0 , k=0;
        while(i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                temp[k] = arr1[i];
                i++;
                k++;
            } else {
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n1){
            temp[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2){
            temp[k] = arr2[j];
            j++;
            k++;
        }

        if (temp.length %2 == 0)
            return (double) (temp[temp.length / 2] + temp[(temp.length / 2) - 1]) /2;
        else return  temp[(temp.length/2)];
    }

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {5,15,25,35,45};

        double median = getMedian(arr1, arr2, arr1.length, arr2.length);
        System.out.println(median);
    }
}
