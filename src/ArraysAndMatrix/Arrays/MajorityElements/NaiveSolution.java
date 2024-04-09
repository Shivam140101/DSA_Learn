package ArraysAndMatrix.Arrays.MajorityElements;

public class NaiveSolution {

    public static int findMajority(int[] arr , int n) {

        for (int i = 0; i<n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++)
                if (arr[i] == arr[j])
                    count++;
            if (count > n/2)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8,6,6,8,8,8,8,8,};

        int majority = findMajority(arr, arr.length);
        System.out.println(majority);
    }
}
