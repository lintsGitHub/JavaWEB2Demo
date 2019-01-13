package Test;

import java.util.ArrayList;

public class ThreadTest {
    static int i=0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=======");
        ThreadClass th;
        ArrayList<ThreadClass> list = new ArrayList<ThreadClass>() ;
        while (i<100){
            th = new ThreadClass(i);
            i++;
            list.add(th);
            th.start();

        }
        //System.out.println(list.size());
        for(ThreadClass ts : list){
            ts.join();
        }
        System.out.println("=======");
    }
}
