import java.util.Scanner;

public class Delete {
    
    public static void main(String[] args) {

        int length = 6;
        
        int[] arr = new int[length];

        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;
        arr[4] = 7;
        arr[5] = 4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index you want to delete");
        int x = sc.nextInt();
        sc.close();

        for(int i = x; i<length-1; i++){
            arr[i] = arr[i+1];
        }

        length--;

        for(int i=0; i<length;i++){
            System.out.println(arr[i]);
        }
        

    }
}
