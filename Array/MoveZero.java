public class MoveZero {
    
    public static void main(String[] args) {
        
        int[] a = {15, 21, 1, 25, 12, 6, 8, 3, 5, 19, 10, 1};

        for(int i = 0; i < a.length-1; i++){
            int minIndex = i;

            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for(int x: a){
            System.out.println(x);
        }
    }
}
