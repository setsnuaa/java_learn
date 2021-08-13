package file;

import java.io.File;

public class ReadFile {
    public static void getAllFileNames(File dir) {
        //过滤得到目录或.java结尾的文件
        File[] files = dir.listFiles((file) ->
                file.isDirectory() || file.toString().endsWith(".java")
        );

        for (File file : files) {
            if (file.isDirectory()) {
                //是目录就继续遍历
                getAllFileNames(file);
            } else {
                //是文件则打印名称
                if (file.getName().endsWith(".java")) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}

