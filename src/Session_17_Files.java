import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.io.PrintWriter;
import java.io.*;
public class Session_17_Files {
    public static void main(String[] args) throws IOException {
        String adress = "";
        File direct = new File ("/Users/mariagnutova/IdeaProjects/First/src/deleteMe/");
        StringBuilder fileNames = new StringBuilder("");
        readall();
       for (int i =0; i<10; i++){
           String fileName = generateRandomFolders(10)[i];
           String directory = "/Users/mariagnutova/IdeaProjects/First/src/deleteMe/"  + fileName;
           File folder = new File (directory);
        boolean newFolder = folder.mkdir();
        fileNames.append(fileName);
        fileNames.append(" ");
       }
        saveFolderNames(fileNames);
        adress = fileNames.toString();
    }

    public static void deleteall(String adress) throws IOException{
        readall();
    }

    public static void readall () throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/mariagnutova/IdeaProjects/First/src/deleteMe/foldersNames.txt"));
        String everything = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
            System.out.println(everything);
        }

    }

    public static void saveFolderNames(StringBuilder fileNames) throws FileNotFoundException{
        try (PrintStream out = new PrintStream(new FileOutputStream("/Users/mariagnutova/IdeaProjects/First/src/deleteMe/foldersNames.txt"))) {
            out.print(fileNames);
        }
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
