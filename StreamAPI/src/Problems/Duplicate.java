package Problems;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    ///  find the duplicate element  form the list using the Stream  api

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 2, 3, 3);

        Set<Integer> set = list.stream()
                .filter(n -> Collections.frequency(list, n) > 1)
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}