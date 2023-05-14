package Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Ade", 20),
                new Student("Abimbola", 40),
                new Student("Felix", 30),
                new Student("Pauline", 2),
                new Student("Mich", 100));


//        Comparator <Student> comparator = (c1, c2) -> {
//            if(c1.getAge() < c2.getAge()){
//                return -1;}
//            else if ( c1.getAge() == c2.getAge()) {
//               return 0;}return 1;};
//
//        Comparator <Student> comparator1 = Comparator.comparing(Student::getName);
//        students.sort(comparator.thenComparing(comparator1));
//
        Map <String, Integer> studentMap = new TreeMap<>();
        students.forEach((x) -> studentMap.put(x.getName(), x.getAge()));

        Map <String, Integer> sortedStudentMap = studentMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new ));
//
//
//        System.out.println(studentMap.entrySet().stream()
//                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey)));
//
      System.out.println(sortedStudentMap);


    }

}


