import  java.util.List;
import java.util.Arrays;
import java.util.Collections;



public class asListMethod {
    public static void main(String args[]){
        String arr[] = {"vanshika","neha"};
        List<String>l1 = Arrays.asList(arr);
        l1.forEach((i)->System.out.println(i));
    }
    
}
