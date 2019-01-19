import java.io.*;
import java.util.Random;

public class Session_17_Files_2 {
    public static void main(String[] args) {
        File [] paths;
       // String address = "/Users/mariagnutova/IdeaProjects/First/src/deleteMe/";
        String address = "deleteMe";
        File direct = new File (address);
        if (direct.exists()){
           deleteOldDir(address);
        }
    // if (!direct.exists()){
        direct.mkdir();
        createDir(address);
    // }
        FilenameFilter fileNameFilter = new FilenameFilter() {
            @Override // WHAT THE FUCK IS THAT
            public boolean accept(File dir, String name) {
                if(name.startsWith("ab") || name.startsWith("abc")) {
                    return true;
                }
                return false;
            }
        };
        paths = direct.listFiles(fileNameFilter);
        for(File path:paths) {
            System.out.println(path);
        }

    }
    public static void createDir (String newFolder){

        for (int i = 0; i < 10; i++){
            String fileName = generateRandomFolders(10)[i];
            String directory = newFolder + "/" + fileName;
            File folder = new File (directory);
            folder.mkdir();
        }
    }

    public static void deleteOldDir (String toDelete){
        String allDir [] = new File(toDelete).list();
        for (int i = 0; i< allDir.length; i++){
            new File(toDelete  + "/"+ allDir[i]).delete();
        }
        new File(toDelete).delete();
    }


    public static String[] generateRandomFolders(int numberOfWords)
    {
        String ab = "ab";
        String abc = "abc";
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(2)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        int f = (random.nextInt(4) + 1);
        for(int l = 0; l < f; l++){
            int k = random.nextInt(10) + 0;
            randomStrings [k] = ab.concat(randomStrings[k]);
        }
        int f2 = (random.nextInt(4) + 1);
        for(int r = 0; r < f2; r++){
            int m = random.nextInt(10) + 0;
            randomStrings [m] = abc.concat(randomStrings[m]);
        }

        return randomStrings;
    }
}
