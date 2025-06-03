import java.util.HashSet;

public class RemoveDuplicate{
    public static void printArray(int arr[],int size){
for(int i=0;i<size;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
    }
    public static int remve(int arr[]){
        HashSet<Integer>hm1 = new HashSet<>();
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(!hm1.contains(arr[i])){
             hm1.add(arr[i]);
             arr[idx] = arr[i];
             idx++;
            }
        }
        return idx;        
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,4,5,1,3,4,7,8,1};
        printArray(arr,arr.length);
        int newSize = remve(arr);
        printArray(arr, newSize);
      
        
    }
}