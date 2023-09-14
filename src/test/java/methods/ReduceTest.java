package methods;


import java.util.Arrays;

import org.junit.Test;

public class ReduceTest {

  @Test
  public void reduce() {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    Integer reduce = Arrays.stream(integers)
            .reduce(0, (a, b) -> a + b);
    System.out.println(reduce);
  }


}

