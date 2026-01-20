public class CountArray {
    public static void main(String[] args) {
        int[] arr = new int[13];

        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }

        int odd = 0, even = 0;
        for(int x : arr){
            if(x%2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Odd and even are: " + odd + " " + even);
    }
}
