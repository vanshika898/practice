public class NextPermutation {
    public static void reverse(int arr[],int si,int ei){
      
        while(si<=ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }
    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void next(int arr[]){
        int n = arr.length;
        //find pivot
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
            
        }
        if(pivot == -1){
              reverse(arr,0,n-1);
            }
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
              int temp = arr[i];
              arr[i] = arr[pivot];
              arr[pivot] = temp;
              break;
            } 
        }
        reverse(arr, pivot+1, n-1);
    }
    
    public static void main(String args[]){
   int arr[] = {2,1,4,3};
  // reverse(arr);
  next(arr);
   printArray(arr);
    }
}
