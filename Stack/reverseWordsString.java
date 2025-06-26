import java.util.Stack;

public class reverseWordsString {
    public static String reverse(String str){
          Stack<Character>s = new Stack<>();
          StringBuilder l = new StringBuilder();
          for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                s.push(c);
            }else{
                while(!s.isEmpty()){
                   l.append(s.pop());
                }
                l.append(" ");
            }
          }
          while(!s.isEmpty()){
            l.append(s.pop());
          }
          return l.toString();

          
        
    }
    public static void main(String[] args) {
       String s = "My name is Vanshika";
       System.out.println(reverse(s));

    }
}
