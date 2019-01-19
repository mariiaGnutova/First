public class Session_9 {
    public static void main(String[] args) {
        String name = "ybishoy";
      //  char [] letters = name.toCharArray();
        int[] index = new int[name.indexOf('y')];

        for ( int i =0 ; i<index.length; i++){
           System.out.println(index[i]);
        }

        int index2 = name.indexOf('b');
        System.out.println(index2);
        boolean a = name.startsWith("bi", 1);
        System.out.println(a);
       // String test = "xxbxx";
        //System.out.println(test.split("x").length);
    }
}
