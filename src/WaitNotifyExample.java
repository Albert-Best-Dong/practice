import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {
    public synchronized void before(){
        System.out.println("Before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("after");

    }

    public static void main(String[] args){
        WaitNotifyExample example = new WaitNotifyExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->example.after());
        executorService.execute(()->example.before());
    }
}
