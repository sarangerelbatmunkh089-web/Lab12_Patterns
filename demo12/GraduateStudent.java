public class GraduateStudent extends Student {
    public GraduateStudent() {
        
    }

    public GraduateStudent(GraduateStudent target) {
        super(target);
    }

    @Override
    public String computeCourseGrade() {
        int sum = 0;
        for (int s : test) sum += s;
        double avg = (double) sum / NUM_OF_TESTS;
        if (avg >= 80)
            courseGrade =  "Pass";
        else
            courseGrade = "Fail";
        return courseGrade;
    }

    @Override
    public Student clone() {
        return new GraduateStudent(this);
    }
}