public class setPrio{
    public static void main(String args[]){
     
     myT t1 = new myT("vipul"); 
     myT t2 = new myT("vanshika");

      myT t3 = new myT("neha");
      t1.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      t3.setPriority(Thread.NORM_PRIORITY);
      t1.start();
      t2.start();
      t3.start();
      


    
     


        
    }
}

class myT extends Thread{


    myT(String name){
        super(name);
    }
    public void run(){
      for(int i=1;i<5;i++){
       System.out.println(Thread.currentThread().getName() + "priority"+ Thread.currentThread().getPriority()+"count-"+  i);
    try{
        Thread.sleep(1000);
    }catch(Exception e){
    System.out.println(e.getMessage());
    }
    }

}
}