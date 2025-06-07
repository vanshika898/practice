public class lambda {
    public static void main(String args[]){
     Shape rectangle =()->{
        System.out.println("draw method of rectanglr class");
     };
     rectangle.draw();

     Shape square= ()->{
         System.out.println("draw method of square class");
     };
     square.draw();
     
    }
}
interface Shape {
    void draw();
}
// class Rectangle  implements  Shape{
//    public void draw(){
//     System.out.println("Rectangle class: draw() method");
//    }
// }

// class Square implements Shape{
//      public void draw(){
//     System.out.println("Shape  class: draw() method");
//    }
// }

// class Circle implements Shape{
//      public void draw(){
//     System.out.println("Circle class: draw() method");
//    }
// }
