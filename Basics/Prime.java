import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        for(int i = 2; i < num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("It's prime");
        }else{
            System.out.println("It's not");
        }
    }
}
