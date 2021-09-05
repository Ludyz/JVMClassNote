package ClassLoaderSubsystem.java;

import java.io.*;

public class CustomClassLoader extends ClassLoader {
    final static String path="F:\\testCustomClassLoader";
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String fileName=getFileName(name);
        File file=new File(path,fileName);
        try {
            FileInputStream in=new FileInputStream(file);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();

            int len=0;
            try {
                while ((len = in.read())!=-1){
                    bos.write(len);
                }
            }catch (IOException e){

            }

            byte[] data=bos.toByteArray();
            in.close();
            bos.close();

            return defineClass(name,data,0,data.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    private String getFileName(String name){
        int index=name.lastIndexOf(".");
        if (index==-1){
            return name+".class";
        }else {
            return name.substring(index+1)+".class";
        }
    }
}
