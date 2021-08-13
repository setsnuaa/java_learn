package file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ReadFile.getAllFileNames(new File("D:\\code\\java_learn\\basis-code\\day08"));
/*        File f = new File("D:\\code\\java_learn\\basis-code\\day08");
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file.getName());
        }*/
    }
}
