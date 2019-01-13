package Test;

/*
* 通过实例来了解单例模式
* 1、什么是单例模式？
*   一个类中只有一个实例化对象
* 2、使用单例模式的好处是什么？
*    1.避免不停地创建对象，更好的优化程序
* */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*//实现单线程单例模式类
 class StuSingle {
//    私有化构造函数
    private StuSingle(){ }
//    初始化静态对象
    private static StuSingle stuSingle = null;
    定义一个来获取对象，而在这个方法里判断了对象是否存在，这样就保证我们调用该类的实例对象只有一个
    public static StuSingle getInstance(){
        if(stuSingle == null){
            stuSingle = new StuSingle();
        }
        return stuSingle;
    }
}*/

/*
* 在上面我们知道了单线程的单例的代码实现
* 单线程的代码是否适用于多线程呢
* 不行，因为当多个线程挤在一起，我们在创建对象时，又有线程进来了，而刚好我们还没有将对象实例出来
* 所以会导致有JVM会创建多个对象的存在
* */

//多线程实现单例模式的类代码
/*class Multithreading{
//    私有化构造器
    private Multithreading(){}
//    初始化静态的对象
        有疑问：volatile 这个关键字是什么意思呢？加在这里有什么用？

    public static volatile Multithreading  multithreading =null;
    public  static   Multithreading getInstance(){
        if (multithreading == null){
            synchronized (Multithreading.class){
                if (multithreading == null){
                    multithreading = new Multithreading();
                }
            }
        }
        return multithreading;
    }
}*/
/*
* 通过内部静态类的方法实现 主要是因为静态类中的静态对象只会被创建一次
* 而我们可以使用方法将这个内部静态类中的对象拿出来
* 这样也会实现了单例模式
* */
/*//通过内部静态类实现单例模式代码
    class Boss{
        private Boss(){ }
        private static class Lay{
            public static Boss boss = new Boss();
        }
        public static Boss getInstance(){
            return Lay.boss;
        }
}*/
public class SingletonMode {


    public static void main(String[] args) {

/*//    单线程下的单例模式
        for (int i = 0; i < 100; i++) {
            StuSingle stuSingle = StuSingle.getInstance();
            System.out.println(stuSingle);
        }*/

/*//        多线程下的单例模式
       ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            service.execute(()-> System.out.println(Multithreading.getInstance()));
        }
        service.shutdown();*/

/*//        内部静态类实现单例模式
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            service.execute(()-> System.out.println(Boss.getInstance()));
        }
        service.shutdown();*/



    }

}


