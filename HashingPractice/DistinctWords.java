/*
 * Write a function that takes a String as an argument and prints all unique words in it.


 Examples:

Input: Java is great. Grails is also great
Output: Java
              Grails
              also


 */
import java.util.HashSet;
public class DistinctWords {

    public static void FindDistinctWords(String s){
        HashSet <String >h1 = new HashSet<>();

        String words[] = s.split(" ");
        for(String i:words){
            if(!h1.contains(i)){
                h1.add(i);
            }
        }
        printSet(h1);
    }

    public static void printSet(HashSet<String>s){
        for(String word : s){
            System.out.print(word+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "geeks for geeks";
        FindDistinctWords(s);
    
    }
}
