public class Course {

    private String courseName;
    private int duration;
    private String instructor;

    public Course(String courseName, int duration, String instructor) {
        this.courseName = courseName;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public String getInstructor() {
        return instructor;
    }
}
