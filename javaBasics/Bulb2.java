

public class Bulb2 {
    private int wattage;
    public void setWattge(int wattage){
        if(wattage>=0 && wattage < 120){
            this.wattage = wattage;
        }
        else {
            this.wattage = 0;
        }
    }
    public int getWattage(){
        return this.wattage;
    }
    public static void main(String args []){
        Bulb2 b = new Bulb2();
        b.setWattge(50);
        System.out.println(b.getWattage());
        
    }
    
}
