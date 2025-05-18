
import static java.awt.SystemColor.menu;

public class LinearSearch {

    public static int LinearSearchString(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println("Integer array key  found at index  : " + LinearSearch(number, key));

        String menu[] = {"Dosa", "Sambhar", " fafda", "Gulab jamun"};
        String keyS = "Sambhar";

        System.out.println(" String array key found at index : " + LinearSearchString(menu, keyS));
    }
}
