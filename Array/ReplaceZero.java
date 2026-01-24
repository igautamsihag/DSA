public class ReplaceZero {
    
    public static void main(String[] args) {
        
        int[] a = {-1, 2, 4, 5, 6, -4, 1, -3};

        for(int x: a){
            if(x<0){
                x=0;
            }
            System.out.println(x);
        }

    }
}
