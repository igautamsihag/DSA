public class PrintReverse {
    public static void main(String[] args) {
        
        int[] arr = {21, 11, 17, 10, 5, 1};

        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
