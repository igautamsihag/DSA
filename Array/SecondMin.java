public class SecondMin {
    
    public static void main(String[] args) {
        
        int[] a = {12, 11, 4, 66, 43, 1, 93};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                secondMin = min;
                min = a[i];
            }else if(a[i]<secondMin && a[i]!=min){
                secondMin = a[i];
            }
        }

        System.out.println("The second smallest is: " + secondMin);
    }
}
