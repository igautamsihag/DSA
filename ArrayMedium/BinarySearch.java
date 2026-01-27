public class BinarySearch {
    

    public static int search(int[] a, int k, int l, int h){

        while(l<=h){
            int mid = (l+h)/2;
            if(k == a[mid]){
                return mid;
            } else if(k>a[mid]){
                l = mid+1;
            } else{
                h = mid-1;
            }
        }

        return l;

    }
    public static void main(String[] args) {
        

        int[] arr = {1,3, 4, 6, 7,10, 17, 22, 55};

        System.out.println(search(arr, 9, 0, arr.length-1));


    }
}
