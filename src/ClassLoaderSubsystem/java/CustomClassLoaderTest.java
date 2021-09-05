package ClassLoaderSubsystem.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomClassLoaderTest {
    public static void main(String[] args) {
        CustomClassLoader classLoader=new CustomClassLoader();
        try {
            Class c=classLoader.loadClass("ClassLoaderSubsystem.Test3");

            Object object=c.newInstance();
            Method method=c.getDeclaredMethod("say",null);
            method.invoke(object,null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
