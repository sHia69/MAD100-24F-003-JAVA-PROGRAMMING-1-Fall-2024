import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("1. Student"
                    + "\n2. Professor"
                    + "\n3. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String studentName = input.next();
                    System.out.print("Enter age: ");
                    int studentAge = input.nextInt();
                    System.out.print("Enter date of birth: ");
                    String studentDateOfBirth = input.next();
                    System.out.print("Enter email: ");
                    String studentEmail = input.next();
                    System.out.print("Enter address: ");
                    String studentAddress = input.next();
                    System.out.print("Enter student ID: ");
                    String studentID = input.next();
                    System.out.print("Enter major: ");
                    String major = input.next();

                    Student student = new Student(studentName, studentAge, studentDateOfBirth, studentEmail, studentAddress, studentID, major);
                    System.out.println("--------------------");
                    System.out.println("\nStudent: " + student.getName() + "\nAge: " + student.getAge()
                            + "\nDate of Birth: " + student.getDateOfBirth() + "\nEmail: " + student.getEmail()
                            + "\nAddress: " + student.getAddress() + "\nStudent ID: " + student.getStudentID()
                            + "\nStudent's Major:" + student.getMajor());
                    System.out.println("\n--------------------");
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String professorName = input.next();
                    System.out.print("Enter age: ");
                    int professorAge = input.nextInt();
                    System.out.print("Enter date of birth: ");
                    String professorDateOfBirth = input.next();
                    System.out.print("Enter ID: ");
                    int professorId = input.nextInt();
                    System.out.print("Enter email: ");
                    String professorEmail = input.next();
                    System.out.print("Enter address: ");
                    String professorAddress = input.next();
                    System.out.print("Enter printing: ");
                    String printing = input.next();
                    System.out.print("Enter office hours: ");
                    String officeHours = input.next();

                    Professor professor = new Professor(professorName, professorAge, professorDateOfBirth, professorId, professorEmail, professorAddress, printing, officeHours);
                    System.out.println("\n--------------------");
                    System.out.println("Professor: " + professor.getName() + "\nAge: " + professor.getAge() + "\nDate of Birth: "
                            + professor.getDateOfBirth() + "\nProfessor ID: " + professor.getId() + "\nEmail: " + professor.getEmail() + "\nAddress: "
                            + professor.getAddress() + "\nPrinting: " + professor.getPrinting() + "\nOffice Hours: "
                            + professor.getOfficeHours());
                    System.out.println("\n--------------------");
                    break;
                case 3:
                    System.out.println("Thank you for using the program!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (!exit);

        input.close();
    }
}