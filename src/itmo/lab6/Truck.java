package itmo.lab6;

public class Truck extends Car {
    private Integer numberOfWheels;
    private Double maxWeight;

    public Truck(int weight, String model, char color, float speed, Integer numberOfWheels, Double maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
        //System.out.println("конструктор TRUCK");
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void newWheels(int num) {
        this.setNumberOfWheels(num);
        System.out.println("new numberOfWheels = " + this.getNumberOfWheels());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfWheels=" + numberOfWheels +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
