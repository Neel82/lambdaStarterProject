package org.neel.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.neel.lambdas.model.User;

public class UserComparator {
    public static void main(String[] args) {

        User sarah = new User("Sarah", 28);
		User james = new User("James", 35);
		User mary = new User("Mary", 33);
		User john1 = new User("John", 24);
		User john2 = new User("John", 25);
        
        List<User> users = Arrays.asList(sarah, james, mary, john1, john2);

        Function<User,String> keyExtractor = (User usr) -> usr.getName ();
        Comparator<User> cmpname = Comparator.comparing(keyExtractor);
        Function<User,Integer> keyExtractor2 = (User usr) -> usr.getAge();
        Comparator<User> cmpAge = Comparator.comparing(keyExtractor2);

        //compare username then compare age,chaining comparators

        Comparator<User> cmp = cmpname.thenComparing(cmpAge);
        users.sort(cmp);

        Consumer<User> action = (User u ) -> System.out.println(u); ;
        users.forEach(action);
        

        //reversing the order
        Comparator<User> reversed = cmp.reversed();
		users.sort(reversed);
		users.forEach(u -> System.out.println(u));
    }
    
}
