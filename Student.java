public class Student extends Person {
    private final String studentID;

    public Student(String first, String last, String utorid, String sid) {
        super(first, last, utorid);
        this.studentID = sid;
    }

    public String getStudentID() {
        return studentID;
    }
}
