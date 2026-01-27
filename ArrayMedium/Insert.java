public class Insert{

    public static void main(String[] args) {
        

        int[] arr = new int[6];

        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;
        arr[4] = 7;

        int x = 17;

        for(int i = arr.length-1; i>4; i--){

            arr[i] = arr[i-1];
        }

        arr[4] = x;

        for(int y: arr){
            System.out.println(y);
        }
    }
}