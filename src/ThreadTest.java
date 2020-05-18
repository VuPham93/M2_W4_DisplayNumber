public class ThreadTest {
    public static void main(String[] args) {
        OddThread num1 = new OddThread();
        EvenThread num2 = new EvenThread();

        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);

        thread1.start();

        try {
            thread1.join(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}
