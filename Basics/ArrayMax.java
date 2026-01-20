public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {2, 22, 455, 1, 12, 11, 55, 28};
        int max = arr[0];

        for(int x : arr){
            if (max<x){
                max = x;
            }
        }

        System.out.println("The maximum is " + max);
    }
}
