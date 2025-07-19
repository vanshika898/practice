public class DecToBin{
    public static String decToBin(int n){
        StringBuilder str = new StringBuilder();
        while(n>0){
            int a = n%2;
            str.append((char)(a+'0'));
            n/=2;
        }
        str.reverse();
        return str.toString();
    }
    public static void main(String [] args){
      System.out.println(decToBin(20));
    }
}