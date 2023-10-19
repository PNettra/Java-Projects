public class Student extends Person implements Displayable {
    private int studentId;
    private int finalGrade;

    public int getId() {
        return studentId;
    }
    public void setId(int newId) {
        this.studentId = newId;
    }

    public int getGrade() {
        return finalGrade;
    }
    public void setGrade(int newGrade) {
        this.finalGrade = newGrade;
    }

    public Student(String firstName, String lastName, int studentId, int finalGrade) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.studentId = studentId;
        this.finalGrade = finalGrade;
    }

    @Override
    public String display() {
        return "Student ID: " + studentId + " " + getFullName() + " Final Grade: " + finalGrade;
    }

}
