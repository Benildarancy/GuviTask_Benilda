package task4.q4;

import java.util.HashMap;
import java.util.Map;

public class StuGrade {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        //Adding a student information to map
        student.put("John", 85);
        student.put("Adam",80);
        student.put("Mathew",76);
        student.put("Peter",91);
        student.put("Potter",67);
        // Displaying the Student list in map
        System.out.println("Student map contains:"+ student);
        //Removing a student from map
        student.remove("Adam");
        System.out.println("Removing student Adam");
        System.out.println("Student new map contains:"+ student);
    }
}

