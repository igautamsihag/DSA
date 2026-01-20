public class RverseFunction {

    static int reverse(int x){
        
        int r = 0;

        while(x>0){
            int digit = x%10;
            r = r*10+digit;
            x/=10;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println("The reverse of 12345 is " + reverse(12345));
    }
}
