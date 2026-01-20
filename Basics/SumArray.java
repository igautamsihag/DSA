public class SumArray{
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 78};
        int sum = 0;

        for(int x : arr){
            sum+=x;
        }

        System.out.println("Sum of Array is: " + sum);
    }
}