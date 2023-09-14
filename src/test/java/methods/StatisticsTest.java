package methods;


import beans.Car;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import mockdata.MockData;
import org.junit.Test;

public class StatisticsTest {

    @Test
    public void count() throws Exception {
        long num = MockData.getPeople().stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female")
                ).count();
        System.out.println("count");
        System.out.println(num);

    }

    @Test
    public void min() throws Exception {
        double num = MockData.getCars().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .getAsDouble();
        System.out.println("min");
        System.out.println(num);
    }

    @Test
    public void max() throws Exception {
        double num = MockData.getCars().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .getAsDouble();
        System.out.println("max");
        System.out.println(num);
    }


    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();
        double num = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .getAsDouble();
        System.out.println("average");
        System.out.println(num);
    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();
        double sum = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
        System.out.println("sum");
        System.out.println(sum);
        System.out.println(bigDecimalSum);

    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
        DoubleSummaryStatistics statistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println(statistics);
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
    }

}