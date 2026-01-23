package Recursion;

public class Factorial {

    public static int fact(int x){

        if(x<=0){
            return 1;
        }else{
            return fact(x-1)*x;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The factorial is: " + fact(4));
    }
}
