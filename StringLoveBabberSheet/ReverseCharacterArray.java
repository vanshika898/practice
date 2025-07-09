

public class ReverseCharacterArray {


    public  static void reverseString(char[] arr) {
        
       int start = 0;
       int end = arr.length-1;
       while(start<end){
        char w = arr[start];
        arr[start] = arr[end];
        arr[end] = w;
        start++;
        end--;

       }
    }
    public static void main(String[] args) {
      char  [] k = {'h','e','l','l','o'};
       reverseString(k);
    }
}
