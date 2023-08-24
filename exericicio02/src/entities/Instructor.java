package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {
    
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Instructor(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }


    public Set<Student> getStudents() {

        Set<Student> students = new HashSet<>();

        for (Course c: courses) {
            for(Student s:c.getStudents()) {
                students.add(s);
            }
        }

        return students;
    }

}
