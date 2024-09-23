package recursion;

public class isSorted {
    public static boolean isSor(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return isSor(arr, index+1);
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10 };
        System.out.println(isSor(arr ,0));
    }
    
}
