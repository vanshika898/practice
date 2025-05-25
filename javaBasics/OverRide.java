

public class OverRide {
    public static void main(String[] args){
     Jump j = new Jump();
     j.PrintName();
     j.jump();
     j.voice();
    }
}
    class Dog{
        public void PrintName(){
            System.out.println("Bruno");
        }
        public void voice(){
            System.out.println("Bhow Bhow ........................!");
        }

    }
 class Jump extends Dog{
        public void jump(){
      System.out.println("jump jump......................!");
        }
        public void voice(){
            System.out.println("meow meow ..............");
        }

    }
    

