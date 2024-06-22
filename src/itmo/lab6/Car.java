package itmo.lab6;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car(int w, String m, char c, float s) {
        this.weight = w;
        model = m;
        color = c;
        speed = s;
        //System.out.println("конструктор Car");
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}


