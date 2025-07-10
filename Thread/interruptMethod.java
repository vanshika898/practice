public class interruptMethod{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();

    }
}
class MyThread extends Thread{
    public void run(){
        Thread t1 = new Thread();
        try{
        t1.sleep(1000);
        }catch(InterruptedException iow){
            System.out.println("Threadd interrupted :"+ iow.getMessage());
        }

        

    }
}