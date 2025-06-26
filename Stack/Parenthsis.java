import java.util.Stack;
public class Parenthsis {
 public static boolean isValidParenthsis(String str){
 Stack <Character> s  = new Stack<>();

 for(int i=0;i<str.length();i++){
   char c = str.charAt(i);
   if(c == '{' ||c =='['||c=='('){
    s.push(c);
   }else {
    if(!s.isEmpty()&&
        (s.peek()=='{' && c == '}' || s.peek()=='[' && c == ']'|| s.peek()=='(' && c == ')')){
            s.pop();
        }else {
            return false;
        }
    }
   }
   return s.isEmpty();
 }
 


    public static void main(String[] args) {
       String s = "[({]})]";
       if(isValidParenthsis(s)){
        System.out.println("yes");
       }else{
        System.out.println("no");
       }

    }
}
