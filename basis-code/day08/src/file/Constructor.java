package file;

import java.io.File;

public class Constructor {
    public static void main(String[] args) {
        File f = new File("D:\\code\\java_learn\\basis-code");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.length());
        for(File name : f.listFiles()){
            System.out.println(name.getName());
        }
    }
}
