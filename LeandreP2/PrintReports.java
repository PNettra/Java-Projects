import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class PrintReports {
    Scanner in = new Scanner(System.in);
    ArrayList<Displayable> classList = new ArrayList<Displayable>();
    char ans;

    public PrintReports() {

        do {
            Displayable c = enterClassroom();
            classList.add(c);
            System.out.println("Enter Y to add another class or N to exit: ");
            ans = in.next().toUpperCase().charAt(0);
        }
        while (ans != 'N');
        report(classList);

    }

    public Displayable enterClassroom() {
        int r;
        String n;

        do {
            System.out.println("Enter a room number: ");
            r = in.nextInt();
        }
        while (r < 100);

        Displayable classroom = enterTeacher();

        do {
            Displayable Student = enterStudent();
            ArrayList<Displayable> enterStudent = new ArrayList<Displayable>();
            System.out.println("Enter anything to continue or quit to exit: ");
            n = in.nextLine();
        }
        while (!Objects.equals(n, "quit"));

        return classroom;
    }

    public Displayable enterTeacher() {
        String firstName;
        String lastName;
        String subject;

        System.out.println("Enter your first name: ");
        firstName = in.nextLine();

        System.out.println("Enter your last name: ");
        lastName = in.nextLine();

        System.out.println("Enter the subject you teach: ");
        subject = in.nextLine();

        Displayable teacher = new Teacher(firstName, lastName, subject); //create an instance of teacher using that data
        return teacher; //return it as a displayable object
    }

    public Displayable enterStudent() {
        int finalGrade;
        int studentId;

        System.out.println("Enter a first name: ");
        String firstName = in.nextLine();

        System.out.println("Enter a last name: ");
        String lastName = in.nextLine();

        do {
            System.out.println("Enter a student ID higher than 0: ");
            studentId = in.nextInt();
        }
        while (studentId <= 0);

        do {
            System.out.println("Enter a final grade between 0 and 100: ");
            finalGrade = in.nextInt();
        }
        while (finalGrade < 0 || finalGrade > 100);

        Displayable student = new Student(firstName, lastName, studentId, finalGrade);
        return student;
    }

    public void report(ArrayList<Displayable> list) {
        int i;

        for (i = 0; i < list.size(); i++) {
            Displayable newReport = list.get(i);
            System.out.println(newReport.display());
        }

    }

    public class School {

        public static void main(String[] args) {
            new PrintReports();
        }
    }
}
