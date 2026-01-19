import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long digit");
        int digit = sc.nextInt();
        sc.close();

        int count = 0;

        while(digit!=0){
            digit/=10;
            count++;
        }

        System.out.println(count);
    }
}
