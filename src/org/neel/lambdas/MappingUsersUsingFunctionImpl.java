package org.neel.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.neel.lambdas.model.User;

public class MappingUsersUsingFunctionImpl {
    
 public static void main(String[] args) {
     User sarah = new User("Sarah");
     User james = new User("James");
	 User mary = new User("Mary");
	 User john = new User("John");
     List<User> users = List.of(sarah, james, mary, john);
     List<String> names = new ArrayList<>();
     Function<User,String> toName = (User user) -> user.getName();
     // i need this function to mapp to the user to it's name,using the function apply Method,and add to the name list
     for(User user : users)
     {
         String name = toName.apply(user);
         names.add(name);
     }
     Consumer<User> action = (User usr) -> System.out.println("User "+usr);
    users.forEach(action);
    Consumer<String> action1 = (String name) -> System.out.println("Name "+ name);
    names.forEach(action1);
 }
}
