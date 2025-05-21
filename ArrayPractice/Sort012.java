
public class Sort012 {

    public static void sorted(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[low] = temp;
                 arr[mid] = arr[low];
               mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String gg[]) {
        int arr[] = {1, 0, 2, 1, 1, 0, 2, 1, 2};
        printArray(arr);
        sorted(arr);
        printArray(arr);
    }
}
