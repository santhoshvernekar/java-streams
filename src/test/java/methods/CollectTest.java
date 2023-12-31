package methods;

import beans.Person;

import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class CollectTest {
    @Test
    public void understandingCollect() throws Exception {
        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(Collectors.toList());

        emails.forEach(System.out::println);
    }
}
