package TaskCollection.Students;


import java.util.Set;

public class Students {
    public static void removeLowPerfStudents(Set<Student> students) {
        students.removeIf(student -> student.calculateAvgGrade()<3.0);
    }



    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    }

