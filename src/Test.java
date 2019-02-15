public class Test {
    public static void main(String[] args) {
        int n = 10;
       staircase(n);

    }
    static void staircase(int n) {
    char [][] pyramid = new char[n][n];
    for (int y = 0; y < n; y++){
        for (int i = n - 1; i >= (n-1) - y; i--) {
            if (i>=0){
            pyramid [y][i] ='#';
        }
        }
    }
        for (int v = 0; v < n; v++){
            for (int w = 0; w < n; w++){
                if (pyramid[v][w] != '#'){
                    System.out.print(" ");
                }
                else {
                    System.out.print(pyramid[v][w]);}
            }
            System.out.println();
        }
    }
}
