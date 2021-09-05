package ClassLoaderSubsystem.java;

public class ClassLoaderTest2{
    public static void main(String[] args) {
        ClassLoader classLoarder = null;
        try {
            classLoarder = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoarder);

            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();//线程上下文加载器
            System.out.println(contextClassLoader);

            ClassLoader classLoader1=ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
