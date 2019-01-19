import javax.swing.*;

public class Fun {
        public static void main(String[] args) {


            String[] stringArray;
         //   String whatTheUserEntered2 = "ggf 56 765 hj k/'''";

               String whatTheUserEntered2 = JOptionPane.showInputDialog("Please enter your string");
                stringArray = whatTheUserEntered2.split("(\\D+)");

                   for (int i=0; i<stringArray.length; i++){
                    System.out.print(stringArray[i]+", ");
                   }

            stringArray = whatTheUserEntered2.split("(\\d+)");
            System.out.println();
            for (int i=0; i<stringArray.length; i++){
                System.out.print(stringArray[i]+", ");
            }

                   String replaseAll;
                   replaseAll = whatTheUserEntered2.replaceAll("(\\D+)", "{}");
            System.out.println();
                   System.out.println(replaseAll);
            replaseAll = whatTheUserEntered2.replaceAll("(\\d+)", "[]");

            System.out.println(replaseAll);

            String email = JOptionPane.showInputDialog("Please enter e-mail adress");
            int a =0;
            int b =0;
           for (int i=1; i<email.length(); i++){
                if (email.charAt(i)=='@'){
                    a++;
                }
            }



   }
}
