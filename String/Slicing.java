public class Slicing {
        public static String sliceString(String s) {
        if(s == null){
            return " ";
        }
       if(s.length()>2){
          return  s.substring(1,s.length()-1);
       }
       return " ";
        
    }
    public static void main(String args[]){
        String s = "heelo";
       System.out.println(sliceString(s));
    }
}

