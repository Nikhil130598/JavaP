package work.FunctionalInterface;

public class Car {
    private String carName;
    private int carNum;
    private double carCost;

    public Car(String carName, int carNum, double carCost) {

        this.carName = carName;
        this.carNum = carNum;
        this.carCost = carCost;

    }

    public String getCarName() {

        return carName;
    }

    public int getCarNum() {

        return carNum;
    }

    public double getCarCost() {
        return carCost;
    }

}
