public class CountWords {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
       if(str == null || str.trim().isEmpty()){
           return 0;
       }
       
       String words [] = str.trim().split(" ");
       return words.length;
    }
    public static void main(String args[]){
        String a = "My name is Vanshika";
      System.out.println(countWords(a));
    }
}