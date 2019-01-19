import javax.swing.*;

public class LearningMethods {

    public static void main(String[] args) {

       /*
        int newAge = sum ( numericValue1, numericValue2);
        System.out.println(newAge);*/
        int[][] array2 = {{1,7,4},{2,3,5, 7}};

        printArray(array2);

    }

    public static  int sum (int a, int b){
        int c = a + b;
        return c;
    }

    public static void  printArray(int[][] array){

        for (int x=0; x<array.length; x++){
            for (int y=0; y<array[x].length; y++){
                System.out.print(array[x][y]+" ");
            }
            System.out.println();
        }
}
}
