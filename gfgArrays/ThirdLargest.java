import java.util.*;
public class ThirdLargest{



    public static int FindThirdLargest(int arr[]){
        Arrays.sort(arr);
        int thirdLargest = -1;int largest =-1;int secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>thirdLargest && arr[i]<secondLargest){
                thirdLargest = arr[i];
            }
        }


       
        return thirdLargest;
    }

    public static void main(String args[]){



        int arr[] = {1,2,3,4,45,32,21,67,89,32};
        System.out.println(FindThirdLargest(arr));
    }
}