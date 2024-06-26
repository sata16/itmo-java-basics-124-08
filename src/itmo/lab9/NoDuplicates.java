package itmo.lab9;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class NoDuplicates {
    public static <T> Collection noDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
