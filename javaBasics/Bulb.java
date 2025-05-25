// pointer 
public class Bulb {
    private int wattage ;

    public void setWattage(int wattage){
        this.wattage = wattage;
    }
    public int getWattage(){
        return this.wattage;
    }
    public static void main(String args[]){
  Bulb b=new Bulb();
  b.setWattage(12);
  System.out.println(b.getWattage());
  Bulb g = null;
  g.setWattage(12);
  System.out.println(g);
    }
    
}
