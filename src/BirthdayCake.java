import java.util.Arrays;

public class BirthdayCake {
    public static void main(String[] args) {

    }
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int candlesCount = 1;
        for (int i = ar.length-2; i>=0; i--){
            if (ar[i]==ar[ar.length-1]){
                candlesCount++;
            }
            else {
                return candlesCount;
            }
        }

    return candlesCount;
    }
}
