
public class PrintSubArray {

    public static void PrintSub(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println("----------------------------------------");
        }
        System.out.print("total sub arrays : " + ts);
    }

    public static void main(String[] gg) {
        int arr[] = {1, 2, 3, 4, 6, 7};
        PrintSub(arr);

    }
}
