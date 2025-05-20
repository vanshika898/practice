
public class InsertionSort {

    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[curr]) {
                    curr = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[curr];
            arr[curr] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 6, 7, 1};
        printArray(arr);
        insertion(arr);
        printArray(arr);
    }
}
