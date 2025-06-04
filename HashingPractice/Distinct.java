import java.util.HashSet;
public class Distinct {
    public static int DistinctElement(int arr[]){
      HashSet<Integer>h1 = new HashSet<>();
      for(int i=0;i<arr.length;i++){
        if(!h1.contains(arr[i])){
            h1.add(arr[i]);
        }
      }
      return h1.size();

    }
    public static void main(String[] args) {
        int arr[] = {10,10,20,20,30,20,40,50};
        System.out.println(DistinctElement(arr));
    }
}
