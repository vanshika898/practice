import java.util.*;
import java.util.stream.Stream;
public class first {
    public static void main(String[] args) {
       Point arr[] = {
        new Point(10, 20),
        new Point(20,25),
        new Point(45,67)};
       //Arrays.sort(arr,new myCamp()) ;
       Arrays.sort(arr,(p1,p2)->p1.x-p2.x);

       Arrays.stream(arr).forEach(System.out::println);

       int arr1[] = {1,2,4,6,7};
       Arrays.sort(arr1);
       Arrays.stream(arr1).forEach(System.out::println);
       
    
}
}

class Point{
    int x ;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+ x +  ","+ y+")";
    }
}
class myCamp implements Comparator<Point>{
     public int compare(Point p1,Point p2){
  return p1.x-p2.x;
     }

     @Override
     public String toString() {
        return "myCamp []";
     }
}

