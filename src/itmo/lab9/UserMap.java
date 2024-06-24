package itmo.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMap {
    public static Map<User, Integer> createUserMap() {
        Map<User, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер Map ");
        int sizeMap = scanner.nextInt();
        for (int i = 0; i < sizeMap; i++) {
            System.out.printf("Введите ключ для элемента %d: ", i + 1);
            User user = new User(scanner.next()); //создаю объект User
            System.out.printf("Введите значение для элемента %d: ", i + 1);
            int value = scanner.nextInt();
            map.put(user, value);
        }
        System.out.println(map);
        return map;


    }

}
