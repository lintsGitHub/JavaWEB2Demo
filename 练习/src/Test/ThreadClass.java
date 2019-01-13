package Test;
public class ThreadClass extends Thread {
    int i;
    public ThreadClass(int i) {
        this.i = i;

    }

    public void run() {

        System.out.println(i);
        try {
            ThreadClass.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
