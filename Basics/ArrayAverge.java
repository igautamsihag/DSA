import java.util.Scanner;

public class ArrayAverge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");

        int[] arr = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        int sum = 0;

        for(int x: arr){
            sum+=x;
        }

        // double avg = (double) sum/arr.length;
        System.out.println("Average of array is " + (double) sum/arr.length);
    }
}
