import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {


    public static void main(String[] args) throws IOException {

        int[][] ar = {{1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}};
        System.out.println(Math.abs(left(ar) - right(ar)));

    }

    static int left(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum = arr[i][i] + sum;
        }
        return sum;
    }

    static int right(int[][] arr) {
        int sum = 0;
        int a = 0;
        for (int i = (arr[0].length - 1); i >= 0; i--) {

                sum = arr[i][a] + sum;
            a++;
            }
            return sum;
    }
}
