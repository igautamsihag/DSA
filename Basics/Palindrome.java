import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome:");
        int num = sc.nextInt();
        sc.close();

        int reversed = 0;
        int original = num;

        while(num!=0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num/=10;
        }

        if(reversed==original){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It\'s not");
        }
    }
}
