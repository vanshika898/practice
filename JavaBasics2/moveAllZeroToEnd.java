public class moveAllZeroToEnd {
    public static void miveAll(int arr[]){
        int temp [] = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k]= arr[i];
                k++;
            }
        }
        while(k<arr.length){
            arr[k] = 0;
            k++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
   int arr[] = {0,0,11,2,3,0};
     miveAll(arr);
     printArr(arr);
    }
}
