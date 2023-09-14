package methods;


import java.util.Arrays;
import java.util.function.Predicate;

import org.junit.Test;

public class FindTest {

    final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;
    final Predicate<Integer> integerPredicate = n -> n < 10;

    @Test
    public void findAny() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int num = Arrays.stream(numbers)
                .filter(integerPredicate)
                .findAny()
                .get();
        System.out.println(num);
    }

    @Test
    public void findFirst() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = Arrays.stream(numbers)
                .filter(numbersLessThan10)
                .findFirst()
                .get();

        System.out.println(num);
    }
}

