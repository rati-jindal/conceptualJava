package LambdaStreams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
        List<String> names = List.of(" alice", "bob", " charlie", " delta ");
        names.stream()
                .map(String::trim)
                .filter(s-> s.length() > 3)
//                .collect(Collectors.toList());
                .toList();
//                .forEach(System.out::println);
    }
}
