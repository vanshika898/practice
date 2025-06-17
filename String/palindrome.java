public class palindrome {
    public static boolean isPalindrome(String a){
    int left = 0;
    int right = a.length()-1;

     
    while(left<=right){
        if(a.charAt(left)!=a.charAt(right)){
            return false;
        }
        left++;
        right--;

    }
    return true;


    }
    public static void main(String args[]){
    String a = "abb";
    if(isPalindrome(a)){
        System.out.println("String is pallindrome");
    }else{
        System.out.println("Not pallindrome");
    }
    
    }
}
