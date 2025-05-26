public class UnionOfArray {
    public static int CountUnionElement(int a[],int b[]){
        int  k=0;
        int arr[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            if(!contains(arr, k, a[i])){
                arr[k] = a[i];
                k++;
            }
        }
        for(int i = 0;i<b.length;i++){
            if(!contains(arr, k, b[i])){
                arr[k] = b[i];
                k++;
            }
        }
        return k;
    }


    public static boolean contains(int arr[],int length,int key){
         for(int i=0;i<length;i++){
            if(arr[i] == key){
             return true;
            }
         }
         return false;
    }
    public static void main(String args []){
    int a[] = {1,2,3,4,5};
    int b[]= {1,2,3};
    System.out.println(CountUnionElement(a, b));

    }
}
