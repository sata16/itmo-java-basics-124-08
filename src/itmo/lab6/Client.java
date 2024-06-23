package itmo.lab6;

public class Client extends Human implements Bank{
    private String nameBank;

    public Client(String name, String surname, String nameBank) {
        super(name, surname);
        this.nameBank = nameBank;
    }
    //Печать наследуется из абстрактного класса Human
    @Override
    protected void printHumanInfo() {
        //System.out.print(super.getName() + " "+super.getSurname()+" "+nameBank+"\n");
        System.out.print(super.getName() + " "+super.getSurname()+" "+bankName()+"\n");
    }
    //Получить имя банка, метод из интерфейса Bank
    @Override
    public String bankName() {
        return this.nameBank;
    }
}
