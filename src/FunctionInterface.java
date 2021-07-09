import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Uisng the built in Function interface
 * it has an apply() method that takes is one input and and
 * returns a single in put
 * in this example1 we are given a String(Tucker) and we want to return its length.
 * */



public class FunctionInterface {
    public static void main(String[] args) {
        // crate an instance of a a Function interface
        Function<String, Integer> function = t -> t.length(); // use lambda expression where t is the in put
        // get the result
        Integer result = function.apply("Tucker");
        // print the result
        System.out.println(result);

        // use the Function interface that take an ArrayList and the result is its length
        Function<ArrayList, Integer> function2 = array1 -> array1.size();
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("good");
        stringList.add("fish");
        stringList.add("goat");
        Integer arraySize = function2.apply(stringList);
        System.out.println(arraySize);



        // use the function interface that takes in an arrayList and returns a map
        // with the list item as the key and its length as the map
        //solution
        // we are going to use the StringList in function2 as our input
        Map<String, Integer> myMap = listToMap(stringList, x -> x.length());
        System.out.println(myMap);
    }

    private static <T, R> Map<T, R> listToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for(T t : list){
            result.put(t, func.apply(t));
        }
        return result;

    }


}

