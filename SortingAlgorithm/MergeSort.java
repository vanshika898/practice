
public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);//leftpart
        mergeSort(arr, mid + 1, ei);//rightpart
        merge(arr, si, mid, ei);//merge

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[(ei - si) + 1];
        int i = si;//leftpart iterator
        int j = mid + 1;//rightpart iterator
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (int m = 0; m < temp.length; m++) {
            arr[si + m] = temp[m];
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 7, 8, 9, 1, 4};
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
