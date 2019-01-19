public class BoxingUnboxing {
    public static void main(String[] args) {
        int age = 20;
        System.out.println("age is " + age);
        // convert int to Integer
        Integer ageWrapper = Integer.valueOf(age);
        // convert Integer to int
        int value = ageWrapper.intValue();
        System.out.println("Integer to int " + value);

        String ageToString = ageWrapper.toString();
        ageToString = ageToString.concat("String");
        System.out.println("Age to String " + ageToString);
        String test = (Integer.toString(age)).concat("test");
        System.out.println( test);
        String age1 = "20";
        Integer stringToInteger = 4;
    }
}
