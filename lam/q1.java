public class q1 {
    /**
     * @param args
     */
    public static void main(String args[]){
     func f = ()->{
        System.out.println("bhai ab  matha fat rha h");
     };
      
    //  String s = "vanshika";
    //  s->s.length();
     f.aaa();
     f.sat();
    }
}
interface func {
    abstract  void aaa();

    default void sat(){
        System.out.println("me hu default method functional interface ki");
    }
}