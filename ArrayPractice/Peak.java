
public class Peak {

    public static int peakElement(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,4,1};
        System.out.print(peakElement(arr));

    }
}
