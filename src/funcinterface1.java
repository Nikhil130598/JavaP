import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class Car {
        private String CarName;
        private int CarNum;
        private double CarCost;

        public Car(String CarName, int CarNum, double CarCost){

            this.CarName = CarName;
            this.CarNum = CarNum;
            this.CarCost = CarCost;

        }

        public String getCarName(){
            return CarName;
        }
        public int getCarNum(){
            return CarNum;
        }
        public double getCarCost(){
            return CarCost;
        }
    }
public class funcinterface1 {
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
