package Test;

public class StringReversal {

    /*
    * 使用递归来实现字符串的反转
    * */
    public static String reversalString(String string){
        if(string == null || string.length()<=1)
            return string;
//        把字符串中的第一个拿到最后，然后使用递归进行循环
        return reversalString(string.substring(1))+string.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reversalString("HELLO"));
    }
}
