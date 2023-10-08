package org.example.human;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HGTest {
    public static void main(String[] args) {
        HumanGenerator hg = new HumanGenerator();
        Collection<Human> generate = hg.generate(30);

        Comparator<Human> humanComparator = Comparator
                .comparing(Human::getName)
                .reversed().thenComparing(Human::getSalary);
        generate.stream()
                .sorted(humanComparator)
                .peek(System.out::println)
                .collect(Collectors.toList());


    }

}
