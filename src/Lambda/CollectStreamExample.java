package Lambda;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamExample {
    public static void main(String[] args) {
        List <String> words = List.of("AAA", "BBB", "CCCC");

        Map <Boolean, List<String>> map = words.stream().collect(Collectors.partitioningBy((w) -> w.length()
        == 0));

        Map <Boolean, Set<String>> map1 = words.stream().collect(Collectors.partitioningBy((w) -> w.length()
                == 0, Collectors.toSet()));

        words.stream().flatMap(s-> Stream.of(s.split(""))).forEach(System.out::println);

    }
}
