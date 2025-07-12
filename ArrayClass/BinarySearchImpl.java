
//Example 2: Implementation of binarySearch() in a Comparable class.
import java.util.Arrays;
import java.util.Collections; 
public class BinarySearchImpl {
   
    public static void main(String[] args) {
        Point arr[] = {
            new Point(12, 13),new Point(23,24),new Point(24, 12),new Point(10, 12)
        };
        Point p = new Point(10 ,12);
        System.out.println(Arrays.binarySearch(arr, p));

    }
    
}

class Point  implements Comparable<Point>{
    int x;
    int y ;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
     public int compareTo(Point p){
        return p.x - this.x;
    }

    
}
