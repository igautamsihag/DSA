public class OddEven{
    public static void main(String[] args) {
        
        int[] arr = {23, 12, 11, 45, 55, 32,};

        int even = 0, odd = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("The odd is " + odd + " and even are " + even);
    }
}