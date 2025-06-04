public class q1{
    public static void main(String ars[]){
     bbb b = new bbb();
     b.PrintA(null);

    }
}
// java uses more specific method means closest method that' why printA of String is runn
  class aaa {
    public void PrintA(String s ){
      System.out.println("String class runns");
    }
}
class bbb extends aaa{
     public  void PrintA(Object o){
        System.out.println("object class runns");
    }
}