public class rotateArray {
    public static void rotateArray(int arr[],int d){
      reverse(arr,0,d-1);
      reverse(arr,d,arr.length-1);
      reverse(arr,0,arr.length-1);
    }

    public static void reverse(int arr[],int si,int ei){
        while(si<ei){
            int temp =arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
 public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,6};
     int d =2;
     rotateArray(arr,d);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
 }   
}
