public class divisibleBy13 {
    public static boolean isDivisibleBy13(String s){
      int rem = 0;
      for(int i=0;i<s.length();i++){
        rem = (rem*10+(s.charAt(i)-'0'))%13;
      }
      return rem==0;
    }
    public static void  main(String args[]){
     String s = "26";
     System.out.println(isDivisibleBy13(s));
    }
}
