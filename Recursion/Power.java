public class Power{

    public static int pow(int m, int n){

        if(n==1){
            return m;
        } else {
           return pow(m, n-1) * m;
        }
    }

    public static void main(String[] args) {
        
        int m = 3, n = 4;

        System.out.println(pow(m,n));
    }
}

