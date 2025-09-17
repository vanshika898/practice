
public class moveAllZeros {

    public static void MoveAllZeros(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        while (j < n) {
            temp[j++] = 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    public static void main(String args[]) {
        int arr[] = {1, 0, 2, 0, 3, 0};
        MoveAllZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
