import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print table for:");
        int table = sc.nextInt();
        sc.close();

        int i = 1;

        while(i<=10){
            System.out.println(table + " X " + i + " = " + (table*i));
            i++;
        }
    }
}
