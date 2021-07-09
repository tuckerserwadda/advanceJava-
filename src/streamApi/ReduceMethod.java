package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *  the reduce method is used to aggregate data .
 *  syntax *** T reduce(T identity, BinaryOperator<T> accumulator)
 *  identity is the initial value of type T
 *  Accumulator is a function for combining two values
 */
public class ReduceMethod {
    public static void main(String [] args){
        // use the  stream reduce method to find the sum of list of integers
        List<Integer> integerList = Arrays.asList(2, 3, 5, 6);
        // solution
        // 1. convert the list into a stream;
       int sum = integerList.stream()
                // add the reduce method
               // now the identity is 0 because the initial value of the sum is zero
               // the accumulator is the function just to add  the elements
        .reduce(0, (a,b)-> a+b);
       System.out.println(sum);

       // we can also use method reference
        Optional<Integer> sum2 = integerList.stream()
                . reduce(Integer ::sum);
        System.out.println(sum2.get()); // use the optional api get method to extract the result

        // get the maximum number
        Integer maxValue = integerList.stream().reduce(0, (a, b) -> a >b?a : b);
        System.out.println((maxValue));
        // max value using the method reference
        Optional<Integer> maxValue2 = integerList.stream().reduce(Integer ::max);// method reference
        System.out.println(maxValue2.get());

        // get the string with the longest character length
        List<String> stringList = Arrays.asList("john", "adam", "amosi", "tucker");
        Optional<String> longest = stringList.stream().
                reduce((str1, str2)-> str1.length() > str2.length()?str1 : str2);
        System.out.println(longest.get());




    }
}
