package Olga;

public class Punkt {

    private int x;
    private int y;

    public Punkt(int j, int k) {
        x = j;
        y = k;
    }

    public void verschiebeInnerhalb(int deltaX, int deltaY) {
        int newPunktX = x + deltaX;
        int newPunktY = y + deltaY;
        if ((newPunktX >= -10) && (newPunktX<= 10) && (newPunktY >= -10) && (newPunktY<= 10)){
            setX(newPunktX);
            setY(newPunktY);
        }
        else {
            System.out.println("Falsch!");


    }}
    public void setX (int newX) {

        x = newX;
    }

    public void setY (int newY) {

        y = newY;
    }

    public int getX() {

        return x;
        }

    public int getY() {
        return y;
    }

    public void anXSpiegeln(int a) {
        x = a*-1;
    }
    public void anYSpiegeln(int b){

        y = b*-1;
    }
    public  void amUrsprungSpiegeln(){
        anXSpiegeln(x);
        anYSpiegeln(y);
    }
}
