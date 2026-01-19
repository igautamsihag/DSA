public class Max {
    public static void main(String[] args) {
        int x = 124, y = 99, z = 44;

        if(x>y && x>z){
            System.out.println(x + " is largest among three");
        }else if(y>x && y>z){
            System.out.println(y + " is the largest among all");
        }else{
            System.out.println(z + " is largest");
        }
    }
}
