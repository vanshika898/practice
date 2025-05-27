//maxProduct
public class MaximumSubArrayMultiply {
    public static int maxProduct(int arr[]){
        int maxProduct = 0;
        for(int i=0;i<arr.length;i++){
            int mul = 1;
            for(int j=i;j<arr.length;j++){
                mul*=arr[j];
                maxProduct = Math.max(maxProduct,mul);
            }
        }
        return maxProduct;
    }
    public static void main(String args [] ){
      int arr[] = {-2, 6, -3, -10, 0, 2};
      System.out.println("Maximum product of array : "+ maxProduct(arr));

      int arr1[] = {1, -3, -10, 0, 6};
      System.out.println("Maximum product of array-1 : "+maxProduct(arr1));

      int arr2[] = {2, 3, 4};
      System.out.println("Maximum product of array-2 : "+maxProduct(arr2));
    }
}
