package task5.q1;

import java.util.*;
import java.util.stream.Collectors;

public class streams1 {
    public static void main(String[]args){
        List < String > strings = Arrays.asList("ghr", "Sggmf", "gshgf", "sgff");
        System.out.println("List of strings: " + strings);
        // Convert strings to uppercase using streams
        List < String > uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("After converting into uppercase"+uppercaseStrings);


    }
}
