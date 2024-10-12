package schoolSystem.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{
    public Teacher(String name, String role, double salary) {
        super(name, role, salary);
    }

    public Teacher() {
    }

    public void teachCourse(String course) {
        System.out.println(getName() + " is teaching "+ course);
    }

    public List<Teacher> readFile() throws IOException {

        List<Teacher> teacherList = new ArrayList<>();

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileReader fileReader = new FileReader(desktopPath + "/teachers.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] details = line.split(",");
            String name = details[0];
            String role = details[1];
            double salary = Double.parseDouble(details[2]);
            teacherList.add(new Teacher(name,role,salary));
        }
        return teacherList;
    }
}
