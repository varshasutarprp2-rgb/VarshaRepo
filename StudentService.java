public class StudentService {

    public void displayStudent(Student student) {

        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("ID : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println("Course : " + student.getCourse());
        System.out.println("Email : " + student.getEmail());
        System.out.println("Instructor : " + student.getCourse().getInstructor());
    }
}
