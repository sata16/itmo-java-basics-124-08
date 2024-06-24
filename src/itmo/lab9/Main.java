package itmo.lab9;

import java.util.*;

import static itmo.lab9.NoDuplicates.noDuplicates;
import static itmo.lab9.RandomNumbers.*;
import static itmo.lab9.User.searchName;
import static itmo.lab9.UserMap.createUserMap;


public class Main {
    public static void main(String[] args) {
        //2
        List<Integer> ints = new ArrayList<>();
        ints.add(555);
        ints.add(66);
        ints.add(555);
        ints.add(77);
        ints.add(66);
        ints.add(555);
        Collection<Integer> ints1 = noDuplicates(ints);
        System.out.println(ints);
        System.out.println(ints1);
        //3
        List<Double> arrayList = new ArrayList<>();//списки для заполнения
        List<Double> linkedList = new LinkedList<>();
        setListRandomNumbers(arrayList);
        setListRandomNumbers(linkedList);
        long startTime = System.currentTimeMillis(); //время старта
        List<Double> arrayListNew = getArrayListRandomElements(arrayList);//для вывода случайных зачений
        System.out.println(System.currentTimeMillis() - startTime); //время окончания и разница
        //System.out.println(arrayListNew);
        startTime = System.currentTimeMillis();
        List<Double> linkedListNew = getLinkedListRandomElements(arrayList);
        System.out.println(System.currentTimeMillis() - startTime);
        //System.out.println(linkedListNew);

        //4
        Map<String, Integer> map = createUserMap();//Создаем мапу
        System.out.println("Ввести имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        User user = new User(name); // создаем юзера
        searchName(map, user.getName()); // проверяем есть ли юзер в мапе


    }


}
