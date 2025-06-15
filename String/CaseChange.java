public class CaseChange {
      
    public static String capitalize(String s){
           if(s==null ||s.isEmpty()){
               return s;
           }
           
           StringBuffer  st = new StringBuffer(s.toLowerCase());
           st.setCharAt(0,Character.toUpperCase(st.charAt(0)));
           return st.toString();
        
    }
    
    public static void changeCase(String s) {
       // StringBuffer str = new StringBuffer(s);
    System.out.println(capitalize(s));
       System.out.println(s.toUpperCase());
        
    }
    public static void main(String args[]){
        String s = "rtQe";
        changeCase(s);
    }
}
