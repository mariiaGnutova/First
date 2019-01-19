import java.io.File;

public class Recursion {
    public static void main (String[] args) {
        String address = "/Users/mariagnutova/IdeaProjects/First/deleteMe";
        File directHigh = new File (address);
        deleteWithRec(directHigh);
    }
    public static String stop = "/Users/mariagnutova/IdeaProjects/First";

    public static void deleteWithRec (File direction) {
        File[] filesToDelete = direction.listFiles();
        if (filesToDelete.length > 0) {
            for (File beDeleted : filesToDelete) {
                beDeleted.delete();
            }
            filesToDelete = direction.listFiles();
            if (!(filesToDelete.length == 0)) {
              try{
                  deleteWithRec(filesToDelete[0].getAbsoluteFile());}
              catch (ArrayIndexOutOfBoundsException e){
                  System.out.println("Exception");
              }
            } else {
               File parent = direction.getParentFile();
               if (!parent.getAbsolutePath().equals(stop)){
                   deleteWithRec(parent);
               }
            }
        }
    }
}
