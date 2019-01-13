import java.util.Timer;
import java.util.TimerTask;

public class Second {
    public static void main(String[] args) {
        /*
        * 相对对于第一种，我们可以控制启动或取消任务
        * 在实现时，Timer类可以调度任务，TimerTask则是通过在run()方法里实现具体任务。 Timer实例可以调度多任务，它是线程安全的。
        * 当Timer的构造器被调用时，它创建了一个线程，这个线程可以用来调度任务
        * */
//        实例化一个任务对象
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
//        创建一个定时器
        Timer timer = new Timer();
//        第一个参数是 将任务对象放到定时器里
//        第二个参数是 首次打开延迟毫秒数
//        第三个参数是 延迟毫秒数
        timer.scheduleAtFixedRate(timerTask,0,1000);
    }
}
