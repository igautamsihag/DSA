public class SwapNumbers {
    public static void main(String[] args) {
        int x = 23, y = 26;
        int temp;

        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("After swap function:");

        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
}
