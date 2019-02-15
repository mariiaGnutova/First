import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        System.out.print(minSum(arr) + " " + maxSum(arr));

    }
    static long minSum (int [] min){

        long sumMin = 0;
        for (int i = 0; i<4; i++){
            sumMin+=min[i];
        }
        return sumMin;
    }

    static long maxSum (int [] min){
        long sumMax = 0;
        for (int i = min.length-1; i>min.length-5; i--){
            sumMax+=min[i];
        }
        return sumMax;
    }
}
