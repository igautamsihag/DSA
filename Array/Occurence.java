public class Occurence{

    public static void main(String[] args) {
        
        int element = 2, count = 0;
        int[] a = {12, 34, 2, 11, 12, 11, 2};

        for(int i = 0; i<a.length; i++){
            if(a[i]==element){
                count++;
            }
        }

        System.out.println("2 occurs no of times: " + count);
    }
}