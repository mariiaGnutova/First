import java.io.File;
import java.util.Date;

import static com.sun.tools.attach.VirtualMachine.list;

public class Session17_File {
    public static void main(String[] args) throws  Exception{
        File input = new File ("text.txt");
        File inputNotEx = new File ("text2.txt");
        File direct2 = new File ("/Users/mariagnutova/IdeaProjects/First/src/deleteMe/");
        File direct = new File ("/Users/mariagnutova/IdeaProjects/First/src/deleteMe2/");
        File input3 = new File ("/Users/mariagnutova/IdeaProjects/First/src/Olga/Punkt.java");
        System.out.println("if file exists: " + input.exists());
        System.out.println("is Directory: " + input.isDirectory());
        System.out.println("is Directory (Olga): " + input3.isDirectory());
        System.out.println("is File: " + input.isFile());
        Date lastModified = new Date(input.lastModified());
        System.out.println("lastModified: " + lastModified);
        boolean newFile = inputNotEx.createNewFile();
        System.out.println(newFile);
        inputNotEx.delete();
        String [] files = direct2.list();
        for ( int i = 0; i< files.length; i++){
            System.out.println(files[i] + " ");
        }

        File [] fileList = direct2.listFiles(); //return a Path
        for ( int i = 0; i< fileList.length; i++){
            System.out.println(fileList[i] + " ");
        }
        boolean createDir = direct.mkdir();
        System.out.println("delete direct: " + direct.delete());
        System.out.println("delete direct2: " + direct2.delete());
        File tryToWrite = new File("/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/src.zip!/java/io/File.java");
        System.out.println("canWrite: " +tryToWrite.canWrite());
        System.out.println("canWrite Input: " + input3.canWrite());


    }

}
