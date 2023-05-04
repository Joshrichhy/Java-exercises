package Lambda;

import Array.Practices.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSampleOne {
    public static void main(String[] args) {
        List<String> names = List.of("Felix", "Prof", "Joshua", "Zainab", "Deborah");
        System.out.println(names.stream().collect(Collectors.toMap((x)-> x, String::length)).entrySet());


        String [] letters = {"Ab1396", "? Q2RBS", "G381ac "};
        System.out.println(Arrays.stream(letters).flatMapToInt(CharSequence::chars).filter(Character::isDigit).count());

    }


    public static List<Integer>mapMethod(List<Integer> numbers) {
        return numbers.stream().map((num) -> num * 2 ).toList();
    }
}
