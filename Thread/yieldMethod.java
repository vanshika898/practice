public class yieldMethod {
    public static void main(String args[]){
        Mythread t1 = new Mythread("t1");
        Mythread t2 =  new Mythread("t2"); 
        t1.start();
        t2.start();
     
    }
}

class  Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println(Thread.currentThread().getName()+ " is running");
            Thread.yield();
        
    }
}
}