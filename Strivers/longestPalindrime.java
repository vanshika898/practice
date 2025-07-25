public class longestPalindrime {
    public static String longPalindrome(String s){
         String longest = " ";
      for(int i=0;i<s.length();i++){
        for(int j = i+1;j<=s.length();j++){
            String sub = s.substring(i,j);
           
            if(isPalindrome(sub)&& sub.length()>longest.length()){
              longest = sub;
            }

        }
      }
      return longest;
    }

    public static boolean isPalindrome(String s){

       int start = 0;
       int end = s.length()-1;
       while(start<end){
        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }
        start++;
        end--;
       }

        return true;
    }
    public static void main(String args[]){
    System.out.println(longPalindrome("babad"));
    }
}
