public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] a = {2,8,5,3,9,4,1};

        for(int i = 0; i<a.length-1; i++){
            int min = i;

            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }

            if(min!=i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

        for(int x: a){
            System.out.print(x + " ");
        }
    }
}
