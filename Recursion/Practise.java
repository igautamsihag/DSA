package Recursion;

public class Practise {
    
    public static void fun(int x){

        if(x>0){
            System.out.println(x);
            fun(x-1);
            
        }
    }


    public static void main(String[] args) {
        fun(10);
    }
}
