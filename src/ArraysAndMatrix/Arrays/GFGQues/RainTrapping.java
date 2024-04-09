package ArraysAndMatrix.Arrays.GFGQues;

public class RainTrapping {

    public static long trappingWater(int[] arr, int n) {
        // Your code here
        long tWater = 0;
        int tower = arr[0];
        int size = n-1;
        int towerIndex = 0;
        long temp = 0;

        for(int i=0 ; i<n ; i++){
            if(arr[i] >= tower){
                tower = arr[i];
                towerIndex = i;
                temp = 0;
            }
            else{
                tWater += (tower - arr[i]);
                temp += (tower - arr[i]);
            }
        }
        if(towerIndex < size){
            tWater -= temp;
            tower = arr[size];
            for(int i = size ; i>= towerIndex ; i--){
                if(arr[i] > tower){
                    tower = arr[i];
                }
                else{
                    tWater += (tower - arr[i]);
                }
            }
        }
        return tWater;
    }

    public static void main(String[] args) {

        int[] arr = {1 ,1, 5, 2, 7, 6, 1, 4, 2, 3};

        long water = trappingWater(arr, arr.length);
        System.out.println(water);
    }
}
