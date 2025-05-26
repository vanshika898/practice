

public class q1 {
    public static void main(String args []){
      aaa a  =new aaa();
    }
    
}
class aaa{
     {
        System.out.println("non static block");
    }
    static{
       System.out.println("static block"); 
    }
    aaa(){
        System.out.println("constroctor got called");
    }
    {
      System.out.println("non static block 2");  
    }
    static{
       System.out.println("static block -2"); 
    }
}
/*static block
static block -2
non static block
non static block 2
constroctor got called */