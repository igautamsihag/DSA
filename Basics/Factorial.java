import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for calculating factorial:");
        int num = sc.nextInt();
        sc.close();

        int f = 1;

        while(num>0){
            f*=num;
            num--;
        }

        System.out.println("Factorial of is " + f);
    }
}
