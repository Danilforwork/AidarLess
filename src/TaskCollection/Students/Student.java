package TaskCollection.Students;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "имя='" + name + '\'' +
                ", группа='" + group + '\'' +
                ", курс=" + course +
                ", средний балл=" + calculateAvgGrade() +
                '}';
    }
    public void promote() {
        if (calculateAvgGrade() >= 3.0) {
            course++;
        }
    }

    public double calculateAvgGrade() {
        if (grades.isEmpty()){
            return 0;
        }
        double sum = 0.0;
        for (double grade : grades){
            sum+=grade;
        }
        return sum /grades.size();
    }

}
