package methods;

import beans.Person;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class FilterLimitTest {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> youngPeople = Lists.newArrayList();
        final int limit = 10;
        int counter = 0;
        for (Person person : people) {
            if (person.getAge() > 18) {
                youngPeople.add(person);
                counter++;
                if (counter == limit)
                    break;
            }
        }

        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        MockData.getPeople().stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());
    }
}
