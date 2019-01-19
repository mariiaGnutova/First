import javax.swing.*;

public class whileLoop {
    public static void main(String[] args) {

     /*   int[] array1 = {2, 5,7,13, 22,45};
        int i = array1.length-1;
        while (i >=0){
            System.out.print(array1[i] + ", ");
            i-=1;
        }*/
       /* Integer age;

        do {
            String whatTheUserEntered = JOptionPane.showInputDialog("Please enter your age:");
            age = Integer.parseInt(whatTheUserEntered);
            System.out.println("You are special");
        }
        while (age > 18);*/


        String[] stringArray;
        String whatTheUserEntered2;
        do {
            whatTheUserEntered2 = JOptionPane.showInputDialog("Please enter two digits:");
            stringArray = whatTheUserEntered2.split("(\\D+)");
        }
        while (stringArray.length != 2);
        Integer a = Integer.parseInt(stringArray[0]);
        Integer b = Integer.parseInt(stringArray[1]);

        System.out.print(a + ", " + b);

        for (int i = (a + b); i <= 100; i = a + b) {
            System.out.print(", " + i);
            a = b;
            b = i;
        }



     /* int i=2;
     int[] arr = new int[3];


      arr[0]=0;
      arr[1]=1;
        System.out.print(arr[0]+", "+ arr[1]);
      for ( arr[i]=(arr[0]+arr[1]); arr[i]<=13; arr[i]=(arr[i-1]+arr[i-2])){

          arr = Arrays.copyOf(arr, arr.length + 1);
          System.out.print(", "+arr[i]);
          i=i+1;
        }*/
    /* int a=0;
     int b=1;
     int c;
        System.out.print(a + ", "+b );
     while ((a+b)<=13){
         System.out.print(", " + (a+b));
         c=a;
         a=b;
         b= b+c;
     }*/


    }
}