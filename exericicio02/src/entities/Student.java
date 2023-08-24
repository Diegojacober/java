package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    private String name;
    private int code;
    private Set<Course> courses = new HashSet<>();


    public Student(String name, int code) {
        this.name = name;
        this.code = code;
    }


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


    public Set<Course> getCourses() {
        return courses;
    }


    public void addCourse(Course course) {
        this.courses.add(course);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Student name: " + this.name + "\n");
        sb.append("Student code: " + this.code + "\n");

        sb.append("------------Student courses------------" + "\n");
        for (Course c: courses) {
            sb.append(c.getName() + "\n");
        }
        sb.append("---------------------------------------" + "\n");

        return sb.toString();
    }
    
}
