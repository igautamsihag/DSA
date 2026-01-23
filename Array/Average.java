public class Average {
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 5, 1, 17, 11};

        int sum=0;

        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }

        System.out.println("The avg is " + (double)sum/arr.length);
    }
}
