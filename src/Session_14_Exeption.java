public class Session_14_Exeption {
    public static void main(String[] args) {

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            e.toString();
        }*/
        String age = "20y";
        try {
            int ageNumber = Integer.parseInt(age);
        }
        catch (NumberFormatException ex){
          System.out.println("Pleace enter right format " + ex.toString());
          //ex.printStackTrace();
        }

    }
}
