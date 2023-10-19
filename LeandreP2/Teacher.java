public class Teacher extends Person implements Displayable {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public Teacher(String firstName, String lastName, String subject) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.subject = subject;
    }

    @Override
    public String display() {
        return getFullName() + " teaches " + subject + ".";
    }

}
