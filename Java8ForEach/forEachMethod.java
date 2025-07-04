import java.util.*;

public class forEachMethod {
    public static void main(String[] args) {
        List <Product>productList = new ArrayList<Product>();
    productList.add(new Product(1, "shampoo",200));
     productList.add(new Product(2, "Vim baar",800));
     productList.add(new Product(3, "Chai",500));
     productList.add(new Product(4, "Soap",400));


     productList.forEach((x)->{System.out.println("Name :"+x.getName());
     System.out.println("Id :"+x.getId());
     System.out.println("Price :"+x.getPrice());
     System.out.println("-----------------------------");
     }

     //Using Stream 
     );

     productList.stream().forEach(System.out::println);
    }
}
class Product{
    private int id;
    private  String name;
    private double price;

    Product(int id,String  name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public void setId(int id){
        this.id = id;

    }

    public int getId(){
        return this.id;
    }



    public void setName(String name){
        this.name= name;

    }

    public String getName(){
        return this.name;
    }



public void setPrice(double price){
        this.price= price;

    }

    public double getPrice(){
        return this.price;
    }
public String toString(){
    return "Product[id : "+ id +" "+ "Name: "+name+" "+ "Price :" +" " +price+"]";
}





}