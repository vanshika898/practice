

public class q1 {
       public static void main(String args[]){
     bbb b = new bbb();
     b.tom();
    }
}
class aaa {
     public void sam(){
        System.out.println("cool");
    }
    public void tom(){
        System.out.println("Great");
    }

}
class bbb extends aaa{
    public void joy(){
        System.out.println("Whatevrer");
    }
    public void tom(){
       // tom();---> memory full call tom again and again
        System.out.println("nice");
    }
}