public class PrintOddEven {
    
    public static void main(String[] args) {
        
        int[] a = {1,2, 32, 12, 11, 57, 87};

        for(int i = 0; i<a.length; i+=2){
            System.out.println("The even are: " + a[i]);
        }

        for(int i = 1; i<a.length; i+=2){
            System.out.println("The odd are: " + a[i]);
        }
    }
}
