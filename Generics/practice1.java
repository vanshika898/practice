public class practice1 {
    public static void main(String[] args) {
       Rupay<Integer> r= new Rupay<>(12) ;
        r.prints();

        Rupay<String> r1= new Rupay<>("vanshika") ;
        r1.prints();
    }
}
class  Rupay<T>{
   public  T value;
    Rupay(T value){
        this.value = value;
    }
    public void prints(){
        System.out.println("Value is :"+value);
    }
    
}
