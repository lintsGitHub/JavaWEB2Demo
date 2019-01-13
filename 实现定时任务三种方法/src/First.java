public class First {
    public static void main(String[] args) {
        /*
        * 第一种使用普通的thread
        * 通过线程类的延迟来实现
        *
        * */
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("hello");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
