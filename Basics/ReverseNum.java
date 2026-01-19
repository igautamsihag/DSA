public class ReverseNum {
    public static void main(String[] args) {
        int n = 10001;

        int reversed = 0;
        int rem;

        while(n!=0){
            rem = n % 10;
            reversed = reversed*10+rem;
            n/=10;
        }

        System.out.println("Reversed number is " + reversed);


    }
}
