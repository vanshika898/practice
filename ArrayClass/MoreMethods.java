import java.util.Arrays;



public class MoreMethods {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
          int[] b = {10, 20, 30};
          int k = Arrays.binarySearch(a, 30);
          int l = Arrays.mismatch(a,b);
          System.out.println(l);
          System.out.println(k);
    }
}
