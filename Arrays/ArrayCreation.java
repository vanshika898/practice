// Arrays are the list of elements of same type that  placed in a contigous memory location
// operation of Arrays
// 1.create 2.Input 3.output 4.update
// run time no changes in arrays in arrays sizee

public class ArrayCreation {

    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //  int marks[] = new int[50];
        int marks[] = {1, 2, 3};
        update(marks);
        printArray(marks);

    }
}
