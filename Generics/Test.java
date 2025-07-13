
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
            ArrayList<? extends  Student> al1 = new ArrayList<>();

            ArrayList<EnggStudent>al2 = new ArrayList<>();
            al1 = al2;
            System.out.print (al1);
    }
}
class Student{

}
class EnggStudent extends Student{

}