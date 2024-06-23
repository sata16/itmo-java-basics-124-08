package itmo.lab6;

public class Successor extends Master {
    public Successor(int number){
        super(number);
    }
    public void printMaster(){
        System.out.println(getNumber());
    }

    @Override
    public String toString() {
        return "Successor{" +
                "number=" + number +
                '}';
    }
}
