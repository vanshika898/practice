public class firstOcurrence {


    public static  int findFirstOcurrence(String haystack,String needle){
        for(int i=0;i<haystack.length();i++){
            for(int j=i+1;j<=haystack.length();j++){
                String sub = haystack.substring(i,j);
                if(sub.equals(needle)){
                    return i;
                }

            }
        }
        return 0;
    }
    public static void main(String args []){
       String haystack = "sadbutsad"; 
       String  needle = "sad";
       System.out.println(findFirstOcurrence(haystack, needle));

    }
}
