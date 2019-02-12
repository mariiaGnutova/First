import java.util.Arrays;

public class Fractions1 {
    public static void main(String[] args) {
        String word = "ppw";
        System.out.println(rearrangeWord(word));
    }

    public static String rearrangeWord(String word) {
        StringBuilder test = new StringBuilder(word);
        char [] result = word.toCharArray();
        Arrays.sort(result);
        char [] reverse = new char[result.length];
        int k = 0;
        for(int i = result.length-1; i>=0; i--){
            reverse[k] = result[i];
            k++;
        }
        String answer = new String (reverse);
        if (!answer.contains(word)){
       return answer;}
       else{
           return "no answer";
        }

    }
}
