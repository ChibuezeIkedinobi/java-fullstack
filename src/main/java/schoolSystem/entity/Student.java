package schoolSystem.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String enrollCourse(Course course) {
        return name + " is taking " + course;
    }

    public List<Student> readFile() throws IOException {

        List<Student> studentList = new ArrayList<>();

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileReader fileReader = new FileReader(desktopPath + "/Student.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] details = line.split(",");
            String name = details[0];
            int age = Integer.parseInt(details[1]);
            studentList.add(new Student(name, age));
        }
        return studentList;
    }
}
