package itmo.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMap {
    public static Map<String, Integer> createUserMap() {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        Integer grades;
        System.out.println("Размер Map ");
        int sizeMap = scanner.nextInt();
        for (int i = 0; i < sizeMap; i++) {
            System.out.printf("Введите ключ для элемента %d: ", i + 1);
            String key = scanner.next();
            System.out.printf("Введите значение для элемента %d: ", i + 1);
            int value = scanner.nextInt();
            map.put(key, value);
        }
        System.out.println(map);
        return map;


    }

}
