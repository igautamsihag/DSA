public class Bubble{
    public static void main(String[] args) {
        
        int[] a = {2,8,5,3,9,4,1};

        for(int i = 0; i<a.length-1; i++){

            boolean flag = false;
            for(int j = 0; j<a.length-1-i; j++){

                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }

        for(int x: a){
            System.out.println(x);
        }
    }
}

