import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static final Lock lock = new ReentrantLock();
    private static final Condition salutCondition = lock.newCondition();
    private static final Condition totoCondition = lock.newCondition();
    private static boolean isSalutTurn = true;

    public static void main(String[] args) {
        Thread salutTread = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while (!isSalutTurn) {
                        salutCondition.await();
                    }
                    System.out.println("Salut ");
                    isSalutTurn = false;
                    totoCondition.signal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread totoTread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while (isSalutTurn) {
                        totoCondition.await();
                    }
                    System.out.println("Toto ");
                    isSalutTurn = true;
                    salutCondition.signal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.lock();
                }
            }
        });
        salutTread.start();
        totoTread.start();

        try {
            salutTread.join();
            totoTread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}