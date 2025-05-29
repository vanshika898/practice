import java.util.Arrays;

public class getMinDiff {
    static int minDiff(int arr[],int k){
    Arrays.sort(arr);
    int miniDiff = arr[arr.length-1]-arr[0];
    int diff = 0;
    for(int i=0;i<arr.length-1;i++){
        int min = Math.min(arr[0]+k,arr[i+1]-k);
        int max = Math.max(arr[arr.length-1]-k,arr[i]+k);
        if(min<0){
            continue;
        }
        diff = max-min;
        miniDiff = Math.min(miniDiff,diff);
    }
    return miniDiff;

    }
    public static void main(String args[]){
    int arr[] = {1, 5, 8, 10};
    int k=2;
   System.out.println(minDiff(arr, k));
    }
}
