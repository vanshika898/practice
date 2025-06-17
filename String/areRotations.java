public class areRotations {
    public static boolean areRotationOf(String a,String b){
        for(int i=0;i<a.length();++i){
            if(a.equals(b)){
               return true;
            }
            char  last  = a.charAt(a.length()-1);
           a = last+a.substring(0, a.length()-1);
        }
        return false;
    }
    public static void main(String args[]){
     String a = "aab";
     String b = "aba";
    System.out.println(areRotationOf(a,b));
    }
}