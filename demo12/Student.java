import java.util.Objects;

abstract class Student {
    public final int NUM_OF_TESTS = 3;
    public String name;
    public int[] test = new int[NUM_OF_TESTS];
    public String courseGrade = "";

    public Student() {
        
    }

    public Student(Student target) {
        if (target != null) {
            this.name = target.name;
            this.test = target.test.clone();
            this.courseGrade = target.courseGrade;
        }
    }

    public abstract String computeCourseGrade();
    public abstract Student clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Student)) return false;
        Student student2 = (Student) object2;
        return Objects.equals(student2.name, name) && 
               Objects.equals(student2.courseGrade, courseGrade);
    }
}


