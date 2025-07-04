import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class SortingEmployeeby {
    public static void main(String[] args) {


        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(1, "mahima", 32, 200));
        employee.add(new Employee(2, "megha", 12, 500));
        employee.add(new Employee(3, "giya", 23, 270));
        employee.add(new Employee(4, "mamta", 56, 1100));
        employee.add(new Employee(5, "nakul", 90, 256790));
System.out.println("--------------------------------------------------------------------");
        employee.stream().sorted(new Comparator<Employee>(){
            public int compare(Employee o1,Employee o2){
                return (int)o1.getSalary()-(int)o2.getSalary();
            }
    }).forEach(System.out::println);

System.out.println("----------------------------------------------------");
     // by lamda expression
     employee.stream().sorted((o1,o2)->o2.getId()-o1.getId()).forEach(x -> System.out.println(x));



     System.out.println("----------------------------------------------");
     //compareLong api

     employee.stream().sorted(Comparator.comparingLong(Employee :: getSalary).reversed()).forEach(System.out::println);
     System.out.println("-------------------------------------------------------------------------------");
     employee.stream().sorted(Comparator.comparingLong(Employee::getId)).forEach(System.out::println);
        
    }
}

class Employee{
    private int id;
    private String name;
    private int salary;
    private int age;

    Employee(int id,String name,int age,int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
     
    public void setId(int id){
       this.id = id;
    }
    public int getId(){
          return this.id;
    }

    public void setAge(int age){
       this.age= age;
    }
    public int getAge(){
          return this.age;
    }


    public void setSalary(int salary){
       this.salary= salary;
    }
    public int getSalary(){
          return this.salary;
    }

public void setName(String name){
       this.name= name;
    }
    public String getName(){
          return this.name;
    }
 public String toString(){
    return "Employee  [ id :"+ id + " name : " + name + " " + "age :"+ age + " " +"Salary : "+ salary+ "]";
 }



}
