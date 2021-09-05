package ClassLoaderSubsystem.java;

import sun.applet.AppletClassLoader;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader systemClassloader=ClassLoader.getSystemClassLoader();//系统类加载器
        System.out.println(systemClassloader);//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

        ClassLoader extensionClassLoader=systemClassloader.getParent();//扩展类加载器
        System.out.println(extensionClassLoader);//sun.misc.Launcher$ExtClassLoader@4554617c

        ClassLoader bootstrapClassLoader=extensionClassLoader.getParent();//获取不到引导类加载器
        System.out.println(bootstrapClassLoader);//null

        System.out.println(AppletClassLoader.getSystemClassLoader().getParent());

        //用户自定义类默认时用AppClassLoader（系统类加载器）进行加载
        ClassLoader classLoader1=ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader1);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类使用bootstrapClassloader进行加载的。--》java的核心类库都是使用bootstrapClassloader加载的
        ClassLoader classLoader=String.class.getClassLoader();
        System.out.println(classLoader);
    }
}
