public class SecondLargest{

    public static int SecondLargestElement(int arr[]){
        int largest = 0;
        int secondLargest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }
public static void main(String args[]){
    int arr[] = {34,56,12,45,23,90};
    System.out.println(SecondLargestElement(arr));
}
}