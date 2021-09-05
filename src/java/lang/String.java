package java.lang;

public class String{
    static {
        System.out.println("custom String");
    }
    //在类 java.lang.String 中找不到 main 方法
    public static void main(String[] args) {
        System.out.println("沙箱安全机制");
    }
}
