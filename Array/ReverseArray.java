public class ReverseArray {
    
    public static void main(String[] args) {
        
        int[] a1 = {12, 34, 12, 11, 37, 23, 112};

        int c = 0;
        int temp = 0;

        for(int i = a1.length-1; i>c; i--){
            temp = a1[i];
            a1[i] = a1[c];
            a1[c] = temp;
            c++;
        }

        for(int x: a1){
            System.out.println(x);
        }
    }
}
