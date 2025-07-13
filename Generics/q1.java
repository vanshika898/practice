class Student<T,s> {
   private  T name ;
   private s rollNumber;
    // Student( T name ,S rollNumber){
    //     this.name = name;
    //     this.rollNumber = rollNumber;
    // }

    public void setName(T name){
        this.name  = name;
    }
    public T getName(){
        return this.name;
    }

    public void setRollNumber(s rollNumber){
        this.rollNumber = rollNumber;
    }
    public s getRollNumber(){
        return this.rollNumber;
    }



}
public class q1{
    public static void main(String[] args) {
        Student<String,Integer> s = new Student();
        s.setName("vanshika");
        s.setRollNumber(34456);
        System.out.println("Name :"+s.getName()+"  | RollNumber : "+s.getRollNumber());
    }
}