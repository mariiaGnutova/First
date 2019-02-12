public class Session_18_Factorial {
    public static void main(String[] args) {
       //System.out.println(factorial(20000));
        factorial(5);
    }
    public static long factorial(long n){
        if (n<0){
            System.out.println("No factorial for negative");
            throw new RuntimeException();
        }
        if (n==1 || n ==0) {
            return 1;
        }
        long f = n*factorial(n-1);
        return f;
    }
}
