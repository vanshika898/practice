public class q2 {
    public static void main(String[] args) {
        Pair<Integer,String>p = new Pair();
        p.x = 20;
        p.y = "vanshika";
       String s = (String) p.x;
       System.out.println(s);

    }
    
}


class Pair<T,S>{
T x;
S y;
}
