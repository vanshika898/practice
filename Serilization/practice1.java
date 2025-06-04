

/*


  serilization  change the state of the object to byteStream where deserilization change byteStream 
  to  rebuild object 
 Steps to serialize

 1.object class implement serilizable interface 
 2.import java.io.serilizable
 3.FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
4.ObjectOutputStream out = new ObjectOutputStream(fileOut);
5.out.writeObject(objectName);
6. out.close();
7.fileOut.close();
8.serialVersionUID is unique id for the class is serialized
using transient keyword data or the variable are not serilized 
 */
import java.io.Serializable;
import java.io.*;
import static java.lang.System.in;
public class practice1 {
    public static void main(String[] args) throws IOException  {
        User u  = new User();
        u.name = "Vanshika";
        u.password = 1234;
        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(u);
        out.close();
        fileOut.close();
        System.out.println("object saved ");


       
        //u.sayHello();
    }
}
 class   User implements  Serializable {
  
    String name;
   transient  int password;
    public void sayHello(){  
        System.out.println("Hello "+ name);
    }
}

class aaa {
    public static void main(String[] args) throws IOException  {
         User u1 = null;
        FileInputStream fileIn = new FileInputStream("G:\\javaDaliy\\practice\\Serilization\\userInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            try{
            u1 = (User)in.readObject();
            in.close();
            fileIn.close();
            System.out.println("now object is deserilized");
            }catch(ClassNotFoundException e){
                System.out.println(e);
            }

            System.out.println("name :"+u1.name);
             System.out.println("password :"+u1.password);
             long serialVersionUID = ObjectStreamClass.lookup(u1.getClass()).getSerialVersionUID();
             System.out.println("uid is:"+ serialVersionUID);

    }
}