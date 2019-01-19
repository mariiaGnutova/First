import javax.swing.*;

public class String_Learning {
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Please enter your name:");
        String userSurname = JOptionPane.showInputDialog("Please enter your surname:");
      /*  userName = userName.concat("_");
        String nameSurname = userName.concat(userSurname);
        System.out.println(nameSurname);
        String[] spliting = nameSurname.split("_Gnutova");
        for (int i = 0; i< spliting.length; i++){
            System.out.print(spliting[i]+ " ");
        }*/
      String conCat = String.format("My name is %s_%s", userName, userSurname);
      System.out.println(conCat);
    }
}
