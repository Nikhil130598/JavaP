package work.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;


public class carData {
    public static void main(String[] args) {

        List<Car> car = Arrays.asList(new Car("Ford", 1306, 355670.95),
                new Car("BMW", 5678, 245785.56));

        Predicate<Car> cc = a -> a.getCarCost() > 250000.00;

        Function<Car, Integer> cn = a -> a.getCarNum() % 3;

        Consumer<Car> carname = a -> System.out.println(a.getCarName() + " cc  " + cn.apply(a));

        car.stream()
                .filter(cc)
                .forEach(carname);
    }
}
