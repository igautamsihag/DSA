public class PalindromeFunction {
    
    static boolean pal(int x){

        int r = 0;
        int ori = x;

        while(x>0){
            int digit = x%10;
            r = r*10+digit;
            x/=10;
        }

        if(r==ori){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("The number 1231 is " + pal(1231));
    }
}
