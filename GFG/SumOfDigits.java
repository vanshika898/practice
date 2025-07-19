public class SumOfDigits {
    public static  int SumOfDigitsFunc(int n){
      String s = String.valueOf(n);
      int sum = 0;
      for(int i=0;i<s.length();i++){
        sum += s.charAt(i) - '0';

      }
      return sum;
    }
    public static void main(String[] args) {
        int k = 1234;
        System.out.println(SumOfDigitsFunc(k));
    }
}
