public class practice2 {
    /**
     * @param <T>
     * @param key
     */
    private static <T> void Shout(T key){
      System.out.println(key+"!!!");
      
    }
    public static void main(String args[]){
        Shout(12);
        Shout("vanshika");

    }

}
