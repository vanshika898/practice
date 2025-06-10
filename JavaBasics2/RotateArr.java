public class RotateArr {
    public static void rotateArray( int arr[],int k){
      if(k>arr.length){
        return ;
      }
      reverse(arr,0,k-1);
      reverse(arr,k,arr.length-1);
      reverse(arr,0,arr.length-1);
    }
    public static void reverse(int arr[],int start,int end){
       while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
       }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        rotateArray(arr,2);
        printArr(arr);

    }
}
