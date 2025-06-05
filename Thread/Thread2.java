public class Thread2  implements Runnable{
    /*
     * Runnable interface is the functional interface because it have 
     * excatly one abstratct method in this interface
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public void run(){
         System.out.println("class thread2 running...............");
        for(int i=0;i<5;i++){
           
        System.out.println(Thread.currentThread().getName()+"   exceuting right now    :"+i);
        }
    }
    public static void main(String args[]){
        System.out.println("starting............");
        
        Thread thread1 = new Thread1("thread1");
        Thread thread2 = new Thread(new Thread2(),"thread2");
        thread1.start();
        thread2.start();
        System.out.println("exiting.................");
    }
}

