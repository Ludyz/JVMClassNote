package ClassLoaderSubsystem;

public class StringTest {
    public static void main(String[] args) {
        java.lang.String string=new java.lang.String();
        //java.lang.SecurityException: Prohibited package name: java.lang
        //沙箱安全机制，保护java核心代码库
        Mystart mystart=new Mystart();

    }
}
