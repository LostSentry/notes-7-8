
import java.util.ArrayList;

public class ITECCourseManager_NoObjects2 {
    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance",1310, 20);

        //Add some students.
        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Bill");
        maintenanceCourse.addStudents("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications",1425, 30);

        //Add some students
        datacomCourse.addStudents("Dave");
        datacomCourse.addStudents("Ed");
        datacomCourse.addStudents("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareDevPro = new ITECCourse("Software Development Projects", 2903, 24);

        softwareDevPro.addStudents("Gus");
        softwareDevPro.addStudents("Harry");
        softwareDevPro.addStudents("Izzy");

        int totalEnrolled = softwareDevPro.getNumberOfStudents();
        System.out.println(softwareDevPro.getName() + " has " + totalEnrolled + " students");



        ITECCourse smallCourse = new ITECCourse("fake course", 1234, 3);
        smallCourse.addStudents("J");
        smallCourse.addStudents("M");
        smallCourse.addStudents("Y");
        smallCourse.addStudents("Extra");
    }
}
