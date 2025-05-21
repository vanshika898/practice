
public class SerachInRotatedArray {

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // mid == target value
        if (arr[mid] == tar) {
            return mid;
        }
        // value lies on  left line
        if (arr[si] <= arr[mid]) {
            // case a : search in leftSide
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);

            }
        } else {
            // case c: right side seach
            if (tar >= arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
        // return 0;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int tar = 0;
        int targetIndex = search(arr, tar, 0, arr.length - 1);
        System.out.println(targetIndex);
    }
}
