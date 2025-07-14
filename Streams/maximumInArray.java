import java.util.Arrays;
import java.util.stream.Stream;
public class maximumInArray {
    public static void main(String[] args) {
        
    
    int arr[] = {1,2,3,5,6};
    int maxi = Arrays.stream(arr).max().getAsInt();
    System.out.println("max:"+maxi);
    
}
}
