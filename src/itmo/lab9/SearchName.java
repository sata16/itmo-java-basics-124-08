package itmo.lab9;

import java.util.Map;

public class SearchName {
    public static void searchName(Map<User, Integer> map, User user) {
        if (map.containsKey(user)) {
            System.out.println(map.get(user));
        } else {
            System.out.println("Name is missing from Map");
        }
    }
}
