public class InversionCount {
   
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,6};
        System.out.println(inversionCount(arr));
    }
}

