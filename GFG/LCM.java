public class LCM{
    public static int findLCM(int a,int b){
        int max_num = Math.max(a,b);
        int min_num = Math.min(a,b);


        for(int i=max_num;i<=a*b;i+=max_num){
            if(i%min_num == 0){
                return i;
            }
        }
        return a*b;
    }
    public static void main(String args[]){
System.out.println(findLCM(12, 16));
    }
}