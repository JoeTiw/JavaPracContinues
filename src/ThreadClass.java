class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i =0; i<50; i++){
            System.out.println("This is Thread");
        }
    }
}







public class ThreadClass {
    public static void main(String[] args) {

        MyThread mt = new MyThread("Joe");
        mt.start();
        System.out.println("The thread Id is " +mt.getId());
        System.out.println("The thread name is " +mt.getName());
    }
}
