package org.neel.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {
        Consumer<String> c1 = (String s) -> System.out.println("c1 comsumes s "+ s);
        //this is same as above thinning the code
        Consumer<String> c2 = s -> System.out.println("c2 consumes s "+s);
        Consumer<String> c3 = c1.andThen(c2);

        //rather that doing c3 =c1.accept("Hello") and c2.accept("Hello"),we are using andThen implementation
        c3.accept("Hello");

        Predicate<String> isNull = (String s) -> s==null;
        System.out.println("For null = "+isNull.test(null));
        System.out.println("For Hello = "+isNull.test("Hello"));

        Predicate<String> isEmpty = (String s) -> s.isEmpty();
        System.out.println("For empty = "+isEmpty.test(""));
        System.out.println("For Hello = "+isEmpty.test("Hello"));
        //predicate chaining
        Predicate<String> p = isNull.negate().and(isEmpty.negate());
        System.out.println("For null = "+p.test(null));
        System.out.println("For empty = "+p.test(""));
        System.out.println("For Hello = "+p.test("Hello"));

    }
}
