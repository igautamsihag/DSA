public class NumberLine {
    public static void main(String[] args) {
        
        int r = 3;
        int c = 5;
        
        for(int i = 1; i <= r*c; i++){
            int row = (i-1)/c + 1;
            System.out.print(row + "  ");

            if(i%c==0){
                System.out.println();
            }
        }
    }
}
