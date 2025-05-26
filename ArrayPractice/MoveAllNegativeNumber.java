public class MoveAllNegativeNumber {
    public static void moveAllInteger(int arr[]){
      int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        

        int arr[] = {1,2,4,6-1,-2,9,0};
        printArray(arr);
        moveAllInteger(arr);
        printArray(arr);
    }
}
