public class MaximumCount {
    public static int maximumc(int arr[]){
        int count = 1;
        int maxi = 0;
     for(int i=1;i<arr.length;i++){
        if(arr[i] == arr[i-1]){
            count++;
        }else{
            maxi = Math.max(maxi,count);
            count = 1;
        }
    
     }
     return Math.max(count,maxi);

    }
    public static void main(String args[]){
        int[] arr = { 0, 1, 0, 1, 1, 1, 1 };
        System.out.println(maximumc(arr));
    }
}
