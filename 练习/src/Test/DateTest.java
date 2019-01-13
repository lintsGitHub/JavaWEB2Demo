package Test;
import java.util.Calendar;
//import java.util.Date;

public class DateTest {
    /*
    1)如何取得年月日、小时分钟秒？
    2)如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
    3)如何取得某月的最后一天？
    4)如何格式化日期？
    */
    public static void main(String[] args) {
//        1)如何取得年月日、小时分钟秒？
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(new Date());
//        获取时间
        System.out.println(calendar.getTime());
//        获取年
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.get(Calendar.YEAR));
//        获取月
        System.out.println(calendar.get(Calendar.MONTH)+1);
//        获取日
        System.out.println(calendar.get(Calendar.DATE));
//        获取小时
        System.out.println(calendar.get(Calendar.HOUR));
//        获取分钟
        System.out.println(calendar.get(Calendar.MINUTE));
//        获取秒
        System.out.println(calendar.get(Calendar.SECOND));
//        获取毫秒
        System.out.println(calendar.get(Calendar.MILLISECOND));

//        2)如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
//        有两种方法可以获取
//        通过calendar对象的getTimeInMillis的方法来获取
        System.out.println(calendar.getTimeInMillis());
//        还有一种通过系统对象的currentTimeMillis方法来获取
        System.out.println(System.currentTimeMillis());

//        3)如何取得某月的最后一天？
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

    }

}
