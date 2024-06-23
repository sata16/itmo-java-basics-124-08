package itmo.lab6;

public class Main {
    public static void main(String[] args) {
        //1
        Human client = new Client("Bradly", "Pitt", "SberBank");
        Human bankEmployee = new BankEmployee("Pierce", "Brosnan", "AlfaBank");
        printInfo(client);
        printInfo(bankEmployee);
        //3
        Truck truck1 = new Truck(50, "bmv", 's', 400, 4, 60.0);
        Car truck = new Truck(500, "bmv", 's', 40, 4, 600.0);
        Car car = new Car(5, "bmv", 'e', 20);
        System.out.println(truck);
        System.out.println(truck1);
        System.out.println(car);
        truck1.newWheels(9);
        //4
        Successor successor = new Successor(10);
        System.out.println("Объект наследник" + successor);
        successor.printMaster();
        //5
        MasterAge masterAge = new MasterAge();
        masterAge.getConsole();
        SuccessorName successorName = new SuccessorName();
        successorName.getConsole();

    }

    //1
    public static void printInfo(Human human) {
        human.printHumanInfo();
    }
}
