public class implenmentAtoi {

    public static int Atoi(String s){
        s = s.trim();
        if(s.length() ==  0 ) return 0;
        int sign =1;
        int result = 0;
        int i = 0 ;
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = (s.charAt(i) == '-') ? -1 :1;
            i++;
        }

        while(i<s.length() || Character.isDigit(i)){
            result = result * 10 + (s.charAt(i)-'0');
            

            if(sign == -1 && -result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign == 1 && result >Integer.MAX_VALUE ) return Integer.MAX_VALUE;
           i++;
        }
        return (int )(sign)*(result);

    }
    public static void main(String[] args) {

        var s = " -042";
        System.out.println(Atoi(s));

        
    }
}
