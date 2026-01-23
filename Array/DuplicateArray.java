public class DuplicateArray {
    public static void main(String[] args) {
        
        int[] a1 = {12, 34, 12, 11, 37, 23};
        int[] a2 = new int[a1.length];

        for(int i = 0; i<a1.length; i++){
            a2[i] = a1[i];
        }

        for(int x : a2){
            System.out.println(x);
        }
    }
}
