package itmo.lab3;

public class Tree {
    private String nameTree;
    private int ageTree;
    private Boolean isLive;


    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(String nameTree, int ageTree) {
        this.ageTree = ageTree;
        this.nameTree = nameTree;
    }

    public Tree(String nameTree, int ageTree, Boolean isLive) {
        this.ageTree = ageTree;
        this.nameTree = nameTree;
        this.isLive = isLive;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "nameTree='" + nameTree + '\'' +
                ", ageTree=" + ageTree +
                ", isLive=" + isLive +
                '}';
    }
}
