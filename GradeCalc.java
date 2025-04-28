public class GradeCalc {
    public Boolean isPassed(Boolean passedExam, Boolean passedAssignments, Boolean passedProject) {
        int count = 0;

        if(passedExam) count++;
        if(passedAssignments) count++;
        if(passedProject) count ++;

        return count >= 2;
    }
}
