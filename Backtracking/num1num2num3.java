
public class num1num2num3 {
    public static boolean findSquence(int arr[]){
        int firstNum = Integer.MAX_VALUE;
        int secondNumber = Integer.MAX_VALUE;
       

     for(int i=0;i<arr.length;i++){
        if(arr[i]<=firstNum){
        firstNum = arr[i];
        }else  if (arr[i]<=secondNumber){
            secondNumber = arr[i];

        }else {
            return true;
        }
    }
    return false;
    }

    public static void main(String args[] ){
    int arr[] = {5,0,4,6};
    System.out.println(findSquence(arr));
    }
}
