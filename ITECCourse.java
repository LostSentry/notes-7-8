import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // data-fields-instance variables
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;
    }

    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    public void addStudents(String studentName) {

        if (students.size() == maxStudents) {
            System.out.println("Course is full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is  " + maxStudents);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void removeStudent(String studentname) {
        if (students.contains(studentname)) {
            students.remove(studentname);
            System.out.println(studentname + " was unenrolled from " + name);
        } else {
            System.out.println(studentname + " was not found in " + name);
        }
    }
}
