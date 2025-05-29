public class PrefixSum{
   static public void preSum(int arr[]){
      int prefix[] = new int[arr.length];
      prefix[0] = arr[0];
    
      for(int i=1;i<arr.length;i++){
       prefix[i] = prefix[i-1]+arr[i];

      }
      for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        preSum(arr);
        //PrintArray(arr);

    }
}