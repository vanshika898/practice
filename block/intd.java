class  bbb {
  bbb(){
    System.out.println("default constructor");
  }

  public void sam(int e){
    System.out.println(e);
  }
  public void sam(char e){
    System.out.println(e);
  }
}
class aaa {
    public static bbb b = new bbb();
    static {
        System.out.println("great");
    }

}

class psp{
    public static void main(String args[]){
      //  bbb b = new  bbb();
       aaa.b.sam(10);
    }
}