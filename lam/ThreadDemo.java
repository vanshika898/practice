public class ThreadDemo  implements   Runnable{
    public void run(){
        System.out.println("run methos....");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo());
        t1.start();
        Thread t = new Thread(()->System.out.println("run method called...."));
        t.start();
     }
}
