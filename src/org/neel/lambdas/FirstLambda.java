package org.neel.lambdas;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambda {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Supplier<String> supplier = 
            () ->{
                System.out.println("I am inside supplier");
                return "Hello Supplier";
            };
            String s1 = supplier.get();
            
            System.out.println("String s1 = "+s1);

            Consumer<String> consumer=
            (String s2) -> {
                System.out.println("I am inside consumer");
             System.out.println("String S2 = "+s2);
            };
            consumer.accept("Hello consumer");
    }
}
