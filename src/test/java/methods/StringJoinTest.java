package methods;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StringJoinTest {

    @Test
    public void joiningStrings() {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

        String s = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(s);
    }

    @Test
    public void joiningStringsWithStream() {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

        String join = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("|"));

        System.out.println(join);
    }
}
