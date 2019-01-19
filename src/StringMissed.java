import javax.swing.*;

public class StringMissed {
    public static void main(String[] args) {
      String userName2 = JOptionPane.showInputDialog("Please enter your name:");
      String userNameWithoutSpace = correctSpace(userName2);
      greetingMessage(userNameWithoutSpace);
      String enteredEmail = JOptionPane.showInputDialog("Please enter your email:");
      emailReplaces(enteredEmail);
    }

    public static String correctSpace (String userName){

        return userName.replaceAll("\\s+"," ");

        /*userName = userName.trim();
        String[] userNameSplit = userName.split(" ");

        String oneSpace = "";
        for (int i =0; i < userNameSplit.length; i++) {
            if (userNameSplit[i].length()>1){
                oneSpace = oneSpace.concat(userNameSplit[i]) + " ";
            }
        }
        oneSpace = oneSpace.trim();
        System.out.println(oneSpace.trim());
        return oneSpace;*/
    }

    public static void greetingMessage ( String greetingName){
        String[] splitStrint = greetingName.split(" ");
        String greetingNameBilding = ("Dear ".concat(splitStrint[splitStrint.length-1])).concat(" ");
        for (int i = 0; i< splitStrint.length-1; i++){
            greetingNameBilding = (greetingNameBilding.concat(splitStrint[i])).concat(" ");
        }
        greetingNameBilding = greetingNameBilding.trim();
        System.out.println(greetingNameBilding);
    }

    public static void emailReplaces (String userEmail){
        String [] emailToArray = userEmail.split("@");
        String[] userDomain = emailToArray[1].split("\\.");
        StringBuilder newEmail = new StringBuilder();
        newEmail.append(emailToArray[0]);
        newEmail.append("@");
        newEmail.append("joji");
        newEmail.append(".");
        newEmail.append(userDomain[1]);
        System.out.println(newEmail);
    }
}

