package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * the Optional api  is A container object which may or may not contain a non-null value.
 * If a value is present, isPresent() returns true. If no value is present,
 * the object is considered empty and isPresent() returns false.
 * Additional methods that depend on the presence or absence of a contained value are provided,
 * such as orElse() (returns a default value if no value is present)
 * and ifPresent() (performs an action if a value is present).
 */
public class OptionalApi {
    public  static void main(String [] args){
        /**
         * in this example we are finding is a 7 exists in a list
         * if it does exist print it else print id deos not exist
         *
         * // usable example
         * in this we are not sure the email exists .
         * public Optional<String>getEmail(){return Optional.ofNullable(email)}
         */
        List<Integer> myList = Arrays.asList(1, 3, 4, 6 );
        // use the optional object to get  a number that exits
        Optional<Integer> six = myList.stream().filter(t ->t==7).findAny();
        if(six.isEmpty()){
            System.out.println(("does not exist "));
        }else {
            System.out.println(six);
        }
    }
}
