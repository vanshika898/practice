import java.util.*;
import java.util.stream.Stream;
public class filterExample {
    public static void main(String[] args) {

        List<Product>l = new ArrayList<Product>();
        for(Product product:getProducts()){
            l.add(product);
        }

        l.forEach(System.out::println);
        
    }      

    private static List<Product> getProducts(){
     List<Product> productList = new ArrayList<Product>();
     productList.add(new Product(1, "shampoo",200));
     productList.add(new Product(2, "Vim baar",800));
     productList.add(new Product(3, "Chai",500));
     productList.add(new Product(4, "Soap",400));

    return productList;

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