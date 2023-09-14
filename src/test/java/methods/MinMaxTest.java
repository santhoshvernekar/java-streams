package methods;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class MinMaxTest {

  @Test
  public void min() {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

    Integer min = numbers.stream()
            .min(Comparator.naturalOrder())
            .get();
    assertThat(min).isEqualTo(1);
  }

  @Test
  public void max() {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer max = numbers.stream()
            .max(Comparator.naturalOrder())
            .get();

    assertThat((max)).isEqualTo(100);

  }
}
