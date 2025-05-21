
public class MajorityElement {

    public static int majorityElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 2, 2};
        System.out.println(majorityElement(arr));

    }

}
