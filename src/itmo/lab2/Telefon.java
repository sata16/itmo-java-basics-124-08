package itmo.lab2;

public class Telefon {
    private String brand;
    private String model;
    private Color color;
    private Integer sizeScreen;
    private Boolean isNew;
    private long price;

    //строковое представление объекта
    public String toString() {
        return "Telefon {" +
                "brand= " + brand +
                ", model= " + model +
                ", color= " + color +
                ", sizeScreen= " + sizeScreen +
                ", isNew= " + isNew +
                ", price= " + price +
                "}";
    }
    //конструктор без параметров
    public Telefon() {
    };
    //конструктор со всеми параметрами
    public Telefon(String brand,String model,Color color,Integer sizeScreen,Boolean isNew,long price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.sizeScreen = sizeScreen;
        this.isNew = isNew;
        this.price = price;
    }
    // несколько параметров
    public Telefon(String brand, String model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}
