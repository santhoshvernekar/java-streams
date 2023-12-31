package methods;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class AverageTest {

    @Test
    public void understandingFilter() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();
        List<Car> filteredCars = cars.stream()
                .filter(car -> car.getPrice() < 1000)
                .collect(Collectors.toList());
        System.out.println(filteredCars);
    }

    @Test
    public void ourFirstMapping() throws Exception {
        // transform from one data type to another
        List<Person> people = MockData.getPeople();

        List<PersonDTO> dtoObject1 = people.stream()
                .map(person -> new PersonDTO(person.getId(),
                        person.getFirstName(), person.getAge()))
                .collect(Collectors.toList());

        List<PersonDTO> dtoObject2 = people.stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList());
        assertThat(dtoObject1).hasSize(people.size());
        assertThat(dtoObject2).hasSize(people.size());


    }

    @Test
    public void averageCarPrice() throws Exception {
        // calculate average of car prices
        ImmutableList<Car> cars = MockData.getCars();
        double average = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);
        cars.forEach(System.out::println);
        System.out.println(average);
    }

    @Test
    public void test() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();
        System.out.println(cars);
    }
}



