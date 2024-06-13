package itmo.lab3;

public class Car {
    private String brand;
    private Double weight;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    //метод для вывода данных класса
    public void printCar(Car car) {
        System.out.println(car);
    }


}
