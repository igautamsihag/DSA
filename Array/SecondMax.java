public class SecondMax {
    
    public static void main(String[] args) {
        
        int[] a = {12, 11, 15, 7, 56, 44, 78};
        int max = a[0];
        int SecondMax = a[0];

        for(int i = 1; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
            }
        }

        for(int i = 1; i<a.length; i++){
            if(SecondMax<a[i] && max>a[i]){
                SecondMax = a[i];
            }
        }


        System.out.println("the second largest element is: " + SecondMax);
    }
}
