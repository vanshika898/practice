// we are forcefully change the private static variable value
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
public class a1 {
    public static void main(String[] args) throws Exception {
        Cat c = new Cat("Browny", 44);
        System.out.println("Old name :"+c.getName());
        Field []cat = c.getClass().getDeclaredFields();

        for(Field f : cat){
            if(f.getName().equals("name")){
               f.setAccessible(true);
               f.set(c, "tiya");
            }
            
        }
        System.out.println("new name :"+c.getName());

        Method []method = c.getClass().getDeclaredMethods();

        for(Method m :method){
            if(m.getName().equals("phirsePrivate")){
                m.setAccessible(true);
                m.invoke(null);
            }
            
        }
        for(Method m :method){
            if(m.getName().equals("heyThisIsPrivate")){
                m.setAccessible(true);
                m.invoke(c);
            }
            
        }
       // System.out.print(c.getName()+ " ");
    }

        
}
class Cat{
    private  final  String name ;
    private int age;

    Cat(String name , int age){
        this.name = name;
        this.age = age;
    }
    public String  getName(){
       return name; 
    } 


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return  age;
    }

    public void meow(){
        System.out.println("meow");
    }


    private void heyThisIsPrivate(){
        System.out.println("Me to private method hu mujhe kese call kiya guys!!");
    }

    public static void publicMethod(){
        System.out.println("This is public method");
    }

    private  static void phirsePrivate(){
        System.out.println("phir se private mehtod");
    }
}