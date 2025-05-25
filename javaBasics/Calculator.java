
// method overloading means same name but differenr signature
public class Calculator {
    public int add(int a,int b ){
        return a+b;
    }
    public int add(int a , int  b,int c){
    return a+b+c;
    }

    public static void main(String [] args){
      Calculator c = new Calculator();
      System.out.println("Sum of methoad with two parameter is :"+c.add(12, 15));
      System.out.println("Sum of methoad with 3 parameter:"+c.add(34, 5, 90));
    }
}
