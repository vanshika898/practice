

public class FindSubsets{
    public static void findString(String str ,String ans ,int i){
        if(i == str.length()){
        if(str.length() == 0){
            System.out.println("null");
        }else{System.out.println(ans);
        }
            return ;
        }
        findString(str, ans+str.charAt(i), i+1);
        findString(str, ans, i+1);
    }
    public static void main(String [] gg){
    String str = "abc";
     findString(str, "", 0);
   

    }
}
