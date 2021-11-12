/*


//----------------THREAD USING IMPLEMENT--------------------------------//


 */
class MyRunnableThread1 implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<50;i++){
            System.out.println("This is thread 1");
        }
    }

}

class MyRunnableThread2 implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<50;i++){
            System.out.println("This is thread 2");
        }
    }
}

public class ThreadImplement {

    public static void main(String[] args) {

        MyRunnableThread1 m1 = new MyRunnableThread1();
        Thread t1 = new Thread(m1);
        MyRunnableThread2 m2 = new MyRunnableThread2();
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

        }
    }

