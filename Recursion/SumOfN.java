package Recursion;

public class SumOfN {

    public static int sum(int n){

        if(n==0){
            return 0;
        }else{
            return sum(n-1) + n;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("The sum of n numbers are: " + sum(-6));
    }
}

    