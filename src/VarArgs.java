import javax.swing.*;

public class VarArgs {

    public static void main(String[] args) {
        String whatTheUserEntered = JOptionPane.showInputDialog("Please enter your words:");
        String[] stringArray = convertToArray(whatTheUserEntered);
        stringRevers(stringArray);

    }

    public static void stringRevers (String ... stringForReves){
        for (int i = stringForReves.length-1; i>=0; i--){
            System.out.print(stringForReves[i]+ " ");
        }
    }
    public static String[] convertToArray (String forConversion){


        forConversion = forConversion.replaceAll("[.,/]+", " ");
        String[] stringArray = forConversion.split("(\\s)");

        return stringArray;
    }
}
