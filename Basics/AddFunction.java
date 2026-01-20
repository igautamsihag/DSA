public class AddFunction {

    static int factorial(int x){
            int fact = 1;

            while(x>0){
                fact*=x;
                x--;
            }

            return fact;
        }

    public static void main(String[] args) {
        
        System.out.println("The factorial of 5 is " + factorial( 5));
    }
}
