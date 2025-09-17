public class MaximumProduct {
    public static int maxProduct(int arr[]){
     int first = -1;
     int second = -1;
     int third= -1;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>first){
        first = arr[i];
        }
     }
     for(int i=0;i<arr.length;i++){
        if(arr[i]>second && arr[i]<first){
        second = arr[i];
        }
     }

     for(int i=0;i<arr.length;i++){
        if(arr[i]>third && arr[i]<second){
        third = arr[i];
        }
        
     }
     return first*second*third;
    }
    public static void main(String[] args) {
        int arr[] = {10,3,5, 6, 20};
        System.out.println(maxProduct(arr));
        
    }
}
