public class pushZerosToEndOfTheArray {
    static  void pushZerosToEnd(int[] arr) {
        // int si = 0;
        // int ei = arr.length-1;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
            
        }
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }
       
        
        
        
    }
    public static void printArray(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {0,1,0,2,3};
            pushZerosToEnd(arr);
            printArray(arr);
        }
}
