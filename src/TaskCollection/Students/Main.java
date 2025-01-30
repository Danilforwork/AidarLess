package TaskCollection.Students;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static TaskCollection.Students.Students.*;

public class Main {
    public static void main(String[] args) {  // Создание набора студентов
        Set<Student> students = new HashSet<>();

        // Добавление студентов
        students.add(new Student("Иван Иванов", "Группа A", 1, List.of(3.5, 4.0, 2.5)));
        students.add(new Student("Петр Петров", "Группа B", 1, List.of(2.0, 2.5, 1.0)));
        students.add(new Student("Светлана Сергеева", "Группа A", 2, List.of(4.5, 3.5, 5.0)));
        students.add(new Student("Алексей Сидоров", "Группа C", 2, List.of(2.8, 3.0, 2.2)));

        // Печать всех студентов перед операциями
        System.out.println("Список студентов перед операциями:");
        for (Student student : students) {
            System.out.println(student);
        }
        // Удаление студентов с низким средним баллом
        removeLowPerfStudents(students);
        System.out.println("\nСписок студентов после удаления студентов с средним баллом < 3:");
        for (Student student : students) {
            System.out.println(student);
        }
        // Перевод студентов на следующий курс
        for (Student student : students) {
            student.promote();
        }

        System.out.println("\nСписок студентов после перевода:");
        for (Student student : students) {
            System.out.println(student);
        }
        // Печать студентов, обучающихся на 2 курсе
        printStudents(students, 2);
    }
    }

