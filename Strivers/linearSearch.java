

public class linearSearch {
    public static int linear(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int arr[]  = {1,2,24,4};
    System.out.println(linear(arr, 4));
    
}    
}
