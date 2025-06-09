import java.util.HashSet;

public class twoSumSet {
    static boolean twoSum(int arr[], int target) {
     HashSet<Integer>h1 = new HashSet<>();
      for(int i=0;i<arr.length;i++){
          int complement = target - arr[i];
          if(h1.contains(complement)){
              return true;
          }
          h1.add(arr[i]);
          
          
      }
      return false;
        
    }
    public static void main(String [] at){
        int arr[] = {1,2,3,4,6};
        int target = 10;
        if(twoSum(arr,target)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}
