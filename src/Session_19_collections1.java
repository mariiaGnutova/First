import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Session_19_collections1 {
    public static void main(String[] args) {
        listofArray();
        //linkedList();
    }
    public static void listofArray (){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add(String.valueOf(5));
        arrayList.add(null);
     //  System.out.println(arrayList.get(7)); //throw an Exception: java.lang.IndexOutOfBoundsException:
        for (String stringElement: arrayList){
            System.out.println(stringElement);
        }
    }
    public static void linkedList (){
        List<String> listWithLink = new LinkedList<>();
        listWithLink.add("first");
        listWithLink.add("second");
        listWithLink.add("third");
        listWithLink.add("last");
        for (String stringElement: listWithLink){
            System.out.println(stringElement);
        }
    }
}
