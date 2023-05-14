package Lambda;

import java.util.Arrays;
import java.util.function.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        CarMethod carMethod = ()-> "i want to stop";
//        String s = "Hello World Joshua ";
//        System.out.println(Arrays.stream(s.split(" ")).reduce((x, y) -> y).get().length());
//
//        String [] letters = {"Ab1396", "Q2RBS", "G381ac"};
//        System.out.println(Arrays.stream(letters).flatMapToInt(CharSequence::chars).filter(Character::isDigit).count());

        String [] names = {"Madam", "Josh", "Pauline", "Oluwatosin"};
        Arrays.stream(names)
                .filter((x) -> x.length() > 4)
                .map((x)-> x + " You have done well")
                .toList()
                .stream()
                .map(String::length).toList().forEach(System.out::println);

        System.out.println(IntStream.range(0, 20).filter(s -> s % 3 == 0).sum());


    }
}
