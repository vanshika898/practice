public class reverseWords {
    public static String rever(String s){
        String arr[]  =  s.trim().split("\\s+");
           reverse(arr);
           return String.join(" ",arr);
           
        

    }
    public static void reverse(String arr[]){
        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            String temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
           si++;
           ei--;
        }
    }
   public static void main(String args[]){
  String s = "my name is vanshika";
  System.out.println(rever(s));
   } 
}
