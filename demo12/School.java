import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        List<Student> studentsCopy = new ArrayList<>();

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent();
        undergraduateStudent.name = "Bat";
        undergraduateStudent.test[0] = 70; undergraduateStudent.test[1] = 65; undergraduateStudent.test[2] = 80;
        undergraduateStudent.computeCourseGrade();
        students.add(undergraduateStudent);

        UndergraduateStudent anotherUndergraduateStudent = (UndergraduateStudent) undergraduateStudent.clone();
        students.add(anotherUndergraduateStudent);

        GraduateStudent graduateStudent = new GraduateStudent();
        graduateStudent.name = "Saraa";
        graduateStudent.test[0] = 90; graduateStudent.test[1] = 85; graduateStudent.test[2] = 95;
        graduateStudent.computeCourseGrade();
        students.add(graduateStudent);

        GraduateStudent anotherGraduateStudent = (GraduateStudent) graduateStudent.clone();
        students.add(anotherGraduateStudent);

        for (Student s : students) {
            studentsCopy.add(s.clone());
        }

        System.out.println("Oyutnuudiin jagsaalt");
        for (Student s : students) {
            System.out.println("Ner: " + s.name + " | Dun: " + s.courseGrade);
        }

        System.out.println("\n Tentsuu yu, huulbarlasan uu");
        System.out.println("undergraduateStudent equals anotherUndergraduateStudent? " + undergraduateStudent.equals(anotherUndergraduateStudent));
        System.out.println("GraduateStudent equals anotherGraduateStudent? " + graduateStudent.equals(anotherGraduateStudent));
    }
}