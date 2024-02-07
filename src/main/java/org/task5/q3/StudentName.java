package task5.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentName {
    public static void main(String[]args){
        List<String> studentName= new ArrayList<>();
        studentName.add("Ashok");
        studentName.add("John");
        studentName.add("Mathew");
        studentName.add("Arvind");
        studentName.add("Adam");
        studentName.add("Peter");
        studentName = studentName.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        for (String name : studentName) {
            System.out.println("Names Start with A: " + name);
        }
    }

}
