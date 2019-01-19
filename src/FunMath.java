
import javax.swing.*;
import java.lang.*;
public class FunMath {
    public static void main(String[] args) {

        String example = JOptionPane.showInputDialog("Please enter your string");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        for (int i = 0; i < example.length(); i++) {
//  ({[])}
            switch (example.charAt(i)) {
                case '(':
                    a++;
                    if ((example.charAt(i+1)== '}') || (example.charAt(i+1)==']')){
                    System.out.println("not right");
                    }
                    break;
                case ')':
                    b++;
                    break;
                case '[':
                    c++;
                    if ((example.charAt(i+1)== '}') || (example.charAt(i+1)==')')){
                    System.out.println("not right");
                }
                    break;
                case ']':
                    d++;
                    break;
                case '{':
                    e++;
                    if ((example.charAt(i+1)== ')') || (example.charAt(i+1)==']')) {
                    System.out.println("not right");
                }
                    break;
                case '}':
                    f++;
                    break;
            }
            if (a<b || c<d || e<f){
                System.out.println("not right");
            }
        }
        if (a!=b || c!=d || e!=f){
            System.out.println("not right");
        }

    }
}
