import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        List<Integer>  check = Arrays.asList(7, 5, 3, 10, 14);

       System.out.println(rearrange (check));
    }

    public static List<Integer> rearrange(List<Integer> elements) {

        int [][]forSort = new int[2][elements.size()];

        for (int i = 0; i < elements.size(); i++){
            forSort[0][i] = elements.get(i);
            forSort[1][i] = convertToBinary(forSort[0][i]);
       }
        Arrays.sort(forSort[0]);
        for (int i = 0; i < elements.size(); i++){

            forSort[1][i] = convertToBinary(forSort[0][i]);
        }

       System.out.println("before sort " + arrayToList(forSort[1]));
        System.out.println("before sort " + arrayToList(forSort[0]));

        bubble_srt(forSort[1], forSort[0]);
        System.out.println("after sort " + arrayToList(forSort[1]));
        System.out.println("after sort " + arrayToList(forSort[0]));
        return arrayToList(forSort[0]);
    }

    public static  int convertToBinary(int numberToConvert){
        int k = 0;
       String conv = Integer.toBinaryString(numberToConvert);
       for (int i = 0; i < conv.length(); i++){
           char t = conv.charAt(i);
           if (t == '1'){
            k++;
           }
       }
    return k;
}

 public static List<Integer> arrayToList (int[] ints){
        List<Integer> intList = new ArrayList<>();
        for (int i : ints)
        {
            intList.add(i);
        }
        return intList;
    }


    public static void bubble_srt(int[] array, int [] array2) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbersfor2arr(i, k, array, array2);
                }
            }
        }
    }

    private static void swapNumbersfor2arr(int i, int j, int[] array, int[] array2) {
        swapNumbers(i, j, array);
        swapNumbers(i, j, array2);
    }
    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
