package Test;
/*
* 测试String StringBuffer StringBuilder的速度
* */

public class String_StringBuffer_StringBuilder {
    static final int num = 10000;
    /*
    * 这是计算测试字符直接拼接的一个方法
    * */
    public static long StringTime(){
        long begin = System.currentTimeMillis();
        String str = "";
        for(int i=0 ; i<num;i++){
            str = str+i+"";
        }
        long end = System.currentTimeMillis();

        return end-begin;
    }
    /*
    * 这是计算测试字符通过Concat方法进行拼接的一个方法
    * */
    public static long StringConcatTime(){
        long begin = System.currentTimeMillis();
        String str = "";
        for(int i=0 ; i<num;i++){
            str =str.concat(i+"");
        }
        long end = System.currentTimeMillis();

        return end-begin;
    }
    /*
    * 这是计算测试使用StringBuffer的一个方法
    * */
    public static long StringBuffer (){
        long begin = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();
        for(int i=0 ; i<num;i++){
            str =str.append(i);
        }
        long end = System.currentTimeMillis();

        return end-begin;

    }
    /*
    * 这是计算测试StringBuilder的一个方法
    * */
    public static long StringBuilder (){
        long begin = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<num;i++){
            str =str.append(i);
        }
        long end = System.currentTimeMillis();

        return end-begin;

    }
    public static void main(String[] args) {
        System.out.println(StringTime());
        System.out.println(StringConcatTime());
        System.out.println(StringBuffer());
        System.out.println(StringBuilder());
        /*
        * 通过一些数据显示：
        * String的普通拼接是最慢的
        * 而String同过concat方法来拼接是比StringBuffer是要慢很多的
        * StringBuilder是最快的
        * */
    }
}
