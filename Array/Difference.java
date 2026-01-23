public class Difference {
    
    public static void main(String[] args) {
        
        int[] arr = {21, 11, 17, 10, 5, 1, 7, 18};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("The difference is : " + (max-min));
    }

}


    

