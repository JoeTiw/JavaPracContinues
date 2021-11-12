class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true){

            System.out.println("This is Thread " +this.getName());
        }


    }
}


public class ThreadPriorities {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1("Joe");
        MyThread1 t2 = new MyThread1("Bhupin");
        MyThread1 t3 = new MyThread1("Bhuwan");
        MyThread1 t4 = new MyThread1("Dinesh");
        MyThread1 t5 = new MyThread1("Durga");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
