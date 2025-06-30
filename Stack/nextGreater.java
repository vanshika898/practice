import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
public class nextGreater {

    public static ArrayList<Integer> nextGreaterElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            result.add(-1);
        }
        Stack <Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
         while(!s.isEmpty() && s.peek()<=arr[i]){
            s.pop();
         }

         if(!s.isEmpty()){
            result.set(i,s.peek());
         }
         s.push(arr[i]);
        }
  
       return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,1};
        ArrayList<Integer> a= nextGreaterElement(arr);
        a.forEach(i->System.out.println(i));


    }

}
