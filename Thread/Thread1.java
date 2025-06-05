public class Thread1 extends Thread {
    Thread1(String name){
      super(name);
    }
    @Override
    public void run(){
                    System.out.println("class thread1 running.....");

        for(int i=0;i<5;i++){
            System.out.println("items:"+Thread.currentThread()+" "+i);
        }
    }
public static void main(String args[]){
System.out.println("Main thread is executing!!");
Thread thread1 = new Thread1("thread1");
// thread1.setDaemon(true);
thread1.start();
System.out.println("Main thread is exiting!!");
}
}
