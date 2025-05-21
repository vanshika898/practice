//package SortingAlgorithm;

public class CountingSort {
    public static void counting(int arr[]){
     int largest = Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        largest = Integer.max(largest,arr[i]);
     }
     int count[] = new int[largest+1]; 
     for(int i=0;i<arr.length;i++){
      count[arr[i]]++ ;
    }
    }
    
    public static void main(String[] args) {
        
    }
}
