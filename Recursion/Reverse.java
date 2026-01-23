package Recursion;

public class Reverse {
    
    public static int rev(int n, int revNum){

        
        if(n<=0){
            return revNum;
        }else{
            return rev(n/10, revNum*10+n%10);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("The reverse of this num is: " + rev(4321, 0));
    }
}
