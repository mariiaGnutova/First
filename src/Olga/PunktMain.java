package Olga;

public class PunktMain {
    public static void main(String[] arg) {

        Punkt p1 = new Punkt(-3, -4);
        p1.verschiebeInnerhalb(3,4);
        System.out.println("Erste Aufgabe:  (" + p1.getX() + ", " + p1.getY() + ")");
        Punkt p2 = new Punkt(-3, -4);
        p2.amUrsprungSpiegeln();
        System.out.println("Zweite Aufgabe: (" + p2.getX() + ", " + p2.getY() + ")");

    }
}