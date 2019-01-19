import java.io.File;

public class Recursion {
    public static void main(String[] args) {
        String address = "/Users/mariagnutova/IdeaProjects/First/deleteMe";
        File directHigh = new File (address);
        deletWithRec(directHigh, address);
    }
    public static void deletWithRec (File direction, String constanta){
  File [] filesToDelet = direction.listFiles();
  if (filesToDelet.length>0){
      for (File beDeleted: filesToDelet){
          beDeleted.delete();
      }
      filesToDelet = direction.listFiles();
      if (filesToDelet.length == 0){
          if (!(direction.getPath() == constanta)){
            deletWithRec(direction.getParentFile(), constanta);
              System.out.println(" Ive done");
          }
      } else {
          deletWithRec(filesToDelet[0], constanta);
       /* String[] test =  filesToDelet[0].list();
        for (String g:test){
            System.out.println(g);*/
        }
      }
  }
    
}
