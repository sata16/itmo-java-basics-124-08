package itmo.lab3;

public class JavaProgram {
    public static void main(String[] args) {
        //1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        //2
       Car car =  new Car("pink",3747.9);
       Car car1 = new Car("green");
       car.printCar(car);
       car.printCar(car1);
       //3
        House house = new House();
        House house1 = new House();
        house.initialize(15,1979,NameHouse.GARDER_HOUSE);
        house1.initialize(27,2079,NameHouse.APARTMENT);
        System.out.println(house.printHouse());
        System.out.println(house1.printHouse());
        //4
        Tree tree = new Tree();
        Tree tree1 = new Tree("oak",90);
        Tree tree2 = new Tree("acacia",10,true);
        System.out.println(tree1);
        System.out.println(tree2);



        }
}
