public class RemoveDuplicates {
    

    public static void main(String[] args) {
        
        int[] a = {1, 2, 2, 3};

        for(int i = 0; i<a.length-1; i++){
            int min = i;

            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }

            if(min!=i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp; 
            }
        }

        int[] b = new int[a.length];
        int index = 0;
        b[index++] = a[0];

        for(int i = 1; i<a.length; i++){
            if(a[i]!=a[i-1]){
                b[index++] = a[i];
            }
        }

        for(int i=0; i<index; i++){
            System.out.println(b[i]);
        }
    }
}
