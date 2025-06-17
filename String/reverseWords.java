public class reverseWords {

      public static String[] ReverseWordString(String a){
        String b[] = a.trim().split(" ");

        int left = 0;
        int right= b.length-1;
        while(left<right){
            String  k = b[left];
            b[left] = b[right];
            b[right] = k;

            left++;
            right--;
        }
        return b;


      }  

    public static void main(String[] args) {
        String a = "vanshika is a good girl";
        String k[] = ReverseWordString(a);

        for(String words : k){
           System.out.print(words +" ");
        }
       
    }
}
