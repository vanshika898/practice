import java.util.HashSet;

public class twoSum {
    public static void sumTwo(int arr[],int target){
        HashSet<Integer>hm = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int com = target-arr[i];
             if(hm.contains(com)){
                 System.out.println("Pair found: (" + arr[i] + ", " + com + ")");
             }
             hm.add(arr[i]);
        }
       
        
        
    }
    public static void main(String args []){
        int arr[] = {1,2,1,3,4,6};
        int target = 10;
        sumTwo(arr, target);
       

    }
    
}
