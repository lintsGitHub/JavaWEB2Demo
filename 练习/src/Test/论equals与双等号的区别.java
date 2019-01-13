package Test;

public class 论equals与双等号的区别 {
    public static void main(String[] args) {
        /*
        * public boolean equals (object obj) 指示引用该方法的对象与参数对象是否相等 默认比较的是地址值
        *   源码：
        *       public boolean equals(Object obj) {
        *           return (this == obj);
        *       }
        *比较地址值没多大意义所以我们一般都会在对象里重写该方法
        * 重写代码优化: 提高效率，提高程序的健壮性
        * == :
        *   基本类型 : 比较的是值是否相同
        *   引用类型 : 比较的是地址值是否相同
        * */
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str1==str2);  //false
        System.out.println(str1==str3); //false
        System.out.println(str3==str4); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1.equals(str2)); //true

        Student stu1 = new Student("LL",23);
        Student stu2 = new Student("LL",23);
        System.out.println(stu1.equals(stu2));
    }
}
