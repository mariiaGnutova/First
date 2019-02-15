import java.util.Arrays;

public class GradingStudents {
    public static void main(String[] args) {
    int [] test = {73, 67, 38, 33};
    System.out.println(Arrays.asList(Arrays.stream(gradingStudents(test)).boxed().toArray( Integer[]::new )));
    }
    static int[] gradingStudents(int[] grades) {
        int [] grade = new int[grades.length];
        for (int i =0; i <grades.length; i++){
            grade[i] = roundGrades(grades[i]);
        }
        return grade;
    }
    static int roundGrades (int newGrades){
        if (newGrades < 38 || newGrades == 100 || newGrades%5 == 0){
            return newGrades;
        }
     for (int i = 1; i < 3; i++){
         if ((newGrades + i)%5 ==0){
             return newGrades + i;
         }
     }
     return newGrades;
    }
}
