package functionalInterfaces;

// predicate built in interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * A predicate is a statement that may be true or false depending on the values of its variables.
 * It can be thought of as a function that returns a value that is either true or false.
 * its implements the test method
 */

// consumer interface- implements other methods

public class PredicateInterface {
    public static void main(String [] args){
        Predicate<Integer> greaterThanTen = t -> t > 10;
        boolean result = greaterThanTen.test(5);
        System.out.println(result);
        Map<Integer, String> integerMap = new HashMap();
        integerMap.put(1, "musa");
        integerMap.put(2, "john");
        integerMap.put(3, "dan");
        integerMap.put(4, "adam");
        Predicate<Map<Integer, String>> twoExists = t ->t.containsKey(2);
        boolean tresult = twoExists.test(integerMap);
        System.out.println(tresult);


    }
}
