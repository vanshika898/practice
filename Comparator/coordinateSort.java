import java.util.*;
import java.util.stream.Stream;
public class coordinateSort {
     public static void coordinatesSort(Point[] arr) {
        Arrays.sort(arr,(p1,p2)->{
            if(p1.x!=p2.x)
              return  p1.x - p2.x;
            else
               return p1.y - p2.y;
            
            
        });
    }
    public static void main(String[] args) {
    }
}
