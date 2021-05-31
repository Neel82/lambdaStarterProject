package org.neel.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*Predicate implementaion Filter the only strings that starts with letter 't' */
public class PredicateLamdas {
public static void main(String[] args) {
    List<String> strings = 
				new ArrayList<>(List.of("one", "two", "three", "four", "five"));
                Predicate<String> filter = (String s) -> !s.startsWith("t");
                strings.removeIf(filter);
                Consumer<String> action = (String s) -> System.out.println(s);;
                strings.forEach(action);
}
}
