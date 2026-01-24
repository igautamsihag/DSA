public class Swap {
    
    public static void main(String[] args) {
        
        int[] a = {1, 2, 4, 5, 6, 8};

        int temp = a[a.length-1];
        a[a.length-1] = a[0];
        a[0] = temp;

        for(int x: a){
            System.out.println(x);
        }

    }
}
