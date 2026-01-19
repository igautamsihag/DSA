import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to find sum:");
        int digit = sc.nextInt();
        sc.close();

        int sum = 0;

        while(digit!=0){
            sum+=digit%10;
            digit/=10;
        }

        System.out.println(sum);


    }
}
