package Test;

public class label_break_continue {
    public static void main(String[] args) {
        /*
        * 简单介绍一下带标签的Break ,Continue用法
        * */
        is5 : for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               if(i==3){
                   break is5;
               }
                System.out.println(i+"===="+j);
            }
        }
    }
}
