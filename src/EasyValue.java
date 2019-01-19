import  java.util.Scanner;
public class EasyValue {
    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("Please enter second number");
        int x2 = sc.nextInt();
        int a;
        int b;
        if (x1 >= x2){
            a = x2;
            b = x1;
        }
        else {
            a = x1;
            b = x2;
        }
        boolean check;
        int count = 0;
        for (int n = a; n<=b; n++){
            check = true;
            if (n<=1){
                check = false;
            }
            for (int k = 2; k < n; k++){
                if ((n%k == 0) || (n<=1)){
                    check = false;
                }
            }
            if (check){
                System.out.print( n + " ");
                count++;
            }
        }
       if (count == 0) {
            System.out.println( "There is nothing to show");
        }
    }
}
