abstract class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
