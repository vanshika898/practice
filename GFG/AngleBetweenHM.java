public class AngleBetweenHM {
    public static double findAngle(String s){
     String k[] = s.split(":");
     double h = Double.parseDouble(k[0]);
     double m  = Double.parseDouble(k[1]);
     h=h%12;
     double result = Math.abs((30*h - 5.5*m));
     return Math.min(result,360-result);

    }
    public static void main(String[] args) {
         System.out.println(findAngle("20:00"));
    }
}
