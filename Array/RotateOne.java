public class RotateOne {
    
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4};

        int z = a[a.length-1];

        for(int i = a.length-1; i>0; i--){
            a[i] = a[i-1];
        }

        a[0] = z;

        for(int x: a){
            System.out.println(x);
        }
    }
}
