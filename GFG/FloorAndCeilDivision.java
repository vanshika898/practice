import java.util.ArrayList;
public class FloorAndCeilDivision {


    public static ArrayList<Integer> floorAndCeil(int a,int b){
     ArrayList<Integer> al = new ArrayList<>();
     int floor = (int)Math.floor((double)a/b);
    int ceil = (int)Math.ceil((double)a/b);

    al.add(floor);
    al.add(ceil);

    return al;

    }
    public static void main(String[] args) {
    int a = 12;
    int b = 13;

    System.out.println(floorAndCeil(a, b));
        
    }
}
