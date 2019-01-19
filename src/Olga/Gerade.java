package Olga;

import javax.swing.*;
import java.util.Scanner;

public class Gerade {
    private int x;
    private int y;
    private int m;
    private int t;

    public Gerade (int j, int i) {
        setM(j);
        setT(i);
    }

    public void checkPunktOnGerade(int a, int b){
        x = a;
        y = b;
        int test = m*x+t-y;
        if (!(test==0)){
            System.out.println("Olga.Punkt liegt im anderen Platz");
        }
        else {
            System.out.println("Olga.Punkt liegt auf die Olga.Gerade");
        }
    }

    public void gibGeradengleichung(){
        String[] stringArray;
        String question = "Pleace enter: m und t";
        do {
            String userAge = JOptionPane.showInputDialog(question);
            stringArray = userAge.split("(\\D+)");
        }
        while (stringArray.length != 2);
        setM(Integer.parseInt(stringArray[0]));
        setT(Integer.parseInt(stringArray[1]));
        System.out.println( "Olga.Gerade:  " + "y=" + getM() + "*x+" + getT());
    }

    public int getM (){
        return m;
    }
    public int getT (){
        return t;
    }

    public void setM (int mSet){
        m = mSet;
    }

    public void setT (int tSet){
        t = tSet;
    }

}
