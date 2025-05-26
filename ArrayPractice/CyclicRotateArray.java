public class CyclicRotateArray {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void rotate(int arr[]){
        int last  = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
    arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        rotate(arr);
        printArray(arr);

    }
}
