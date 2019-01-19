public class Demension_Array {
    public static void main ( String[] args){
    int x;
    int y;
        int [][] ages = new int [5][10];

     /*   for (x=0; x< ages.length; x++){
            for (y=0; y<10; y++){
                ages[x][y]=y+1;
            }
        }

        for (x=0; x< ages.length; x++){
            for (y=0; y<10; y++){
                System.out.print(ages[x][y]+" ");
            }
            System.out.println();
        }*/


       /* int [][] first = new int [4][4];
        int [][] second = new int [4][4];
        int [][] summa = new int [4][4];
        first[0]= new int[]{9, 8, 9, 1};
        first[1]= new int[]{8, 7, 6, 8};
        first[2]= new int[]{4, 2, 3, 2};
        first[3]= new int[]{5, 7, 9, 0};
        second[0]= new int[]{9, 0, 8, 5};
        second[1]= new int[]{6, 7, 5, 4};
        second[2]= new int[]{3, 6, 8,4};
        second[3]= new int[]{5, 0,8, 7};
        for (x=0; x<4; x++){
            for (y=0; y<4; y++){
                summa[x][y]= (first[x][y]+second[x][y]);
                System.out.print(summa[x][y]+" ");
            }
            System.out.println();
        }*/
       int [][] odinodin = new int [5][9];

        for (x=1; x<5; x++){
            for (y=x; y<(odinodin[x].length-x); y++){
                odinodin[x][y]=1;
            }

        }

        for (x=0; x<5; x++){
            for (y=0; y<9; y++){
                System.out.print(odinodin[x][y]+" ");
            }
            System.out.println();
        }


    }

}
