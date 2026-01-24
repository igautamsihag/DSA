public class SelectionSortDescending {
    
    public static void main(String[] args) {
        
        char[] a = {'C', 'M', 'A', 'I'};

        for(int i = 0; i<a.length-1; i++){
            int max = i;

            for(int j = i+1; j<a.length; j++){
                if(a[j]>a[max]){
                    max = j;
                }
            }

            if(max!=i){
                char temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }

        for(char x: a){
            System.out.println(x);
        }
    }
}
