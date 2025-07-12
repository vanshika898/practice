
import java.util.Comparator;
import java.util.Arrays;


public class q3 {

    public static void main(String[] args) {
        Student s[]  = {new Student("vanshika",1),new Student("Tanisha",2),
    
                        new Student("Arishi",5),new Student("deifg",'7')
    };

    Arrays.sort(s,Comparator.comparing(Student::getName).thenComparing(Student::getRollNo));
    Arrays.stream(s).forEach(System.out::println);

    }
}

class Student {

    private int rollNo;
    private String name;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "["+name+","+rollNo+"]";
    }

}
