package ArraysAndMatrix.Arrays.GFGQues;

public class FractionTrouble {


    public static int gcd(int a , int b){
        if (b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static int[] largestFraction(int n , int d){

        int max = 10000;
        int num = -1 , den = 1;
        for (int i = max ; i>1 ; i--){
            int j = (n*i-1)/d;
            if (gcd(i,j)==1 && ((num*i) <= (den*j))){
                num = j;
                den = i;
            }
        }
        return new int[]{num,den};
    }


    public static void main(String[] args) {

        int n=1;
        int d=8;

        int[] fraction = largestFraction(n, d);
        for (int i: fraction)
            System.out.print(i+" ");
    }
}
