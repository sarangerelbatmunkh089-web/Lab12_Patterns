public class UndergraduateStudent extends Student {
    public UndergraduateStudent() {
        
    }

    public UndergraduateStudent(UndergraduateStudent target) {
        super(target);
    }

    @Override
    public String computeCourseGrade() {
        int sum = 0;
        for (int s : test) sum += s;
        double avg = (double) sum / NUM_OF_TESTS;
        if (avg >= 60)
            courseGrade =  "Pass";
        else
            courseGrade = "Fail";
        return courseGrade;
    }

    @Override
    public Student clone() {
        return new UndergraduateStudent(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UndergraduateStudent) || !super.equals(object2)) return false;
        return true; 
    }
}
