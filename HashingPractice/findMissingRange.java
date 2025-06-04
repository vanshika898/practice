import java.util.HashSet;
public class findMissingRange {
   public static void missingValue(int arr[],int low,int high){
    HashSet <Integer>h1 = new HashSet<>();
    for(int i=0;i<arr.length;i++){
        h1.add(arr[i]);
    }
   
   for(int i=low;i<=high;i++){
    if(!h1.contains(i)){
        System.out.println(i);
    }
   }
   }
    public static void main(String args []){
   int arr[] = {10,11,12,15};
   int High = 15;
   int Low = 10;

   missingValue(arr, Low, High);
    }

    
}
