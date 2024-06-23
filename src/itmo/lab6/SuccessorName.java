package itmo.lab6;

public class SuccessorName extends MasterAge{
    @Override
    public void getConsole() {
        String name = super.scanner.nextLine();
        System.out.println(name);
    }
}
