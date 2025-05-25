//inheristance + overloading + class +object 

 public class Rectangle{
    private int length;
    private int breadth;
       public void setLength(int length){
      this.length = length;
       }
       public int getLength(){
   return this.length;
       }
       public void name(){
        System.out.println("Print rectangle");
        System.out.println("================================================");
       }

public void setBreadth(int breadth){
      this.breadth = breadth;
       }
       public int getBreadth(){
   return this.breadth;
       }
       public void area(Rectangle r){
        System.out.println("area of rectangle : "+2*(r.getLength()+r.getBreadth()));
       }

       
      static  class square extends Rectangle{
        private int height;
    public void name(){
        System.out.println("Print  square");
        System.out.println("========================================");
    }
        public void setHeight(int height){
            this.height = height;
        }
        public int getHeight(){
            return this.height;
        }

        public void area(square s){

            System.out.println( "areaof square:" +s.getLength()* s.getBreadth()*s.getHeight());
        }


       }

     public static void main(String gg[]){
        square s =  new square();
        Rectangle r = new Rectangle();
        s.name();
        r.name();
        s.setLength(10);
        s.setBreadth(20);
        s.setHeight(30);

         r.setLength(10);
        r.setBreadth(20);
     
        System.out.println("Height is :"+s.getHeight());
        System.out.println("length is :"+s.getLength());
        System.out.println("Breadth is :"+s.getBreadth());

        s.area(s) ;
        r.area(r);

        s.name();
        r.name();


     }
}