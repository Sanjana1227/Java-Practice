
class totalearning extends Thread{
    int total=0;
    public void run(){
        synchronized (this){
            for(int i=1;i<=10;i++){
                total=total+100;
            } 
        this.notify();
        }
       }
}

public class thread_comm {
    public static void main(String[] args) throws InterruptedException {
        totalearning te= new totalearning();
        te.start();
        synchronized(te){
            te.wait();
            System.out.println(te.total);
        }
    }
}
