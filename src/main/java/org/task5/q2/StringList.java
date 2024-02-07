package task5.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringList {
    public static void main(String[]args) {
        List<String> list = Arrays.asList("abd", "", "ghj", "efg", "", "asd");
        System.out.println(" The list with empty values = " + list);

        Stream<String> stream = list.stream();
        Predicate<String> empty = String::isEmpty;
        Predicate<String> emptyStr = empty.negate();
        System.out.println("Strings after removing empty values = "+stream.filter(emptyStr).collect(Collectors.toList()));

        }
    }

