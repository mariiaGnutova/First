import javax.swing.*;

public class   HalloWorld {

    public static void main ( String[] args){
        //int age = 20;
        String whatTheUserEntered = JOptionPane.showInputDialog("Please enter your age:");
        Integer numericValue = Integer.parseInt(whatTheUserEntered);
        /*if (numericValue>= 18){
            System.out.println("You are lucky");
        }
        /*else if (numericValue == 18){
            System.out.println("You are lucky");
        }
        else {
            int wait = 18 - numericValue;
            System.out.println("You should wait " + wait+ " years.");


        }*/
        switch (numericValue){
            default:
                System.out.println("You are " + numericValue);
                break;
            case 17:
            case 16:
            case 15:
                System.out.println("You are teenager ");
                break;
            case 20:
                System.out.println("You are 20");
                break;
            case 21:
                System.out.println("You are 21");
                break;

        }

    }
}
