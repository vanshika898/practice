public class yieldMethod {
    public static void main(String args[]){
        Mythread t1 = new Mythread();
        Mythread t2 =  new Mythread(); 
        t1.start();
        t2.start();
     
    }
}

class  Mythread extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println(Thread.currentThread().getName()+ " is running");
            Thread.yield();
        
    }
}
}