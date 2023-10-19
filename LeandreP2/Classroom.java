import java.util.ArrayList;

public class Classroom extends Person implements Displayable {
    int roomNumber;
    Displayable teacher;
    ArrayList<Displayable> students;

    Classroom() {
    }

    Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String display() {
        return "Room Number: " + roomNumber + "/n" + teacher + "/n" + students;
    }

}
