import com.sun.org.apache.xpath.internal.operations.Equals;

public class StringBuilder_learning {
    public static void main(String[] args) {
        StringBuilder playWithMe = new StringBuilder("Hallo");
        playWithMe.append(" ");
        playWithMe.append("World");
        playWithMe.reverse();


        for (int i=0; i< playWithMe.length(); i++){
            if (playWithMe.charAt(i) == ' '){
                playWithMe.replace(i, i,"");
          }
        }
        playWithMe.reverse();
        System.out.println(playWithMe.delete(5, playWithMe.length()));
    }
}
