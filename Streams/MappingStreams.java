import java.util.stream.Stream;
import java.util.*;
public class MappingStreams {
    //Stream.map()
    public static void main(String[] args) {
        List<user>user1 = new ArrayList<user>();
        user1.add(new user(1, "tanaya", 120202));
        user1.add(new user(2, "manaya", 20202));
        user1.add(new user(3, "ranaya", 1234));


        List<userDTO>userdto = new ArrayList<userDTO>();
        userDTO u = null;
        for(user k : user1){
            userdto.add(new userDTO(k.getId(), k.gettString()));
        }
        //Stream map method;
        user1.stream().map((t)-> new userDTO(t.getId(),t.gettString())).forEach(System.out::println);

        
    }
}

class user{
    private int id;
    private String email;
    private int password;

    user(int id,String email,int password){
        this.id = id;
        this.email = email;
        this.password = password;
    }


    public void setId(int id){
        this.id  = id;
    }
    public int getId(){
        return this.id;
    }


    public void setEmail(String email){
        this.email = email;
    }

    public String gettString(){
        return this.email;
    }


    public void setPassword(int password){
        this.password = password;

    }
    public int getPassword(){
        return this.password;
    }


    public String toString(){
        return "User [ id :"+id +" "+ "email:"+email + " "+"password : "+ password +"]";
    }

}




class userDTO{
    private int id;
    private String email;


    userDTO(int id,String email){
        this.id = id;
        this.email = email;
        
    }
    public void setId(int id){
        this.id  = id;
    }
    public int getId(){
        return this.id;
    }


    public void setEmail(String email){
        this.email = email;
    }

    public String gettString(){
        return this.email;
    }

     public String toString(){
        return "UserDTO [ id :"+id +" "+ "email:"+email +"]";
    }


}