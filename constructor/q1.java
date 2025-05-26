

public class q1 {
public static void main(String args [] ){
    bbb b  =new bbb();
    System.out.println("==============================================");
    bbb b1 = new bbb(2);
    aaa a = new aaa(2);
}
    
}
class aaa{
   aaa(){
System.out.println("default constructor got called of aaa");
   }
   aaa(int a){
     System.out.println("parameterized constructor got called of aaa");
   }
}
class bbb extends aaa{ 
    bbb(){
        System.out.println("default constructor got called of bbb");
    }
    bbb(int a){
        System.out.println("parameterized constructor got called of bbb");
    }
}
