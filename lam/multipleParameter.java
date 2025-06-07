public class multipleParameter {
    public static void main(String args[]){
        Addable abb =(int a,int b)-> {
        return (a+b);
        };
        System.out.println("addition in lamda expression:"+abb.addition(2, 3));
     
     }
    }

interface Addable {
    int addition(int a,int b);
}
class addableImp implements Addable{
    public int addition(int a,int b){
        return a+b;
    }
 
    
   
}
