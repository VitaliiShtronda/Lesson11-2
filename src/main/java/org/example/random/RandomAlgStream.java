package org.example.random;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgStream {
    public static void main(String[] args) {
        RandomAlg randomAlg = new RandomAlg();

        Stream<Integer> integerStream = Stream.iterate(5895156,
                (seed) -> randomAlg.withSeed(seed).next());

      integerStream
                .filter(i -> i > 20)
                .filter(i -> i < 50)
              .limit(10)
              .peek(System.out::println)
              .collect(Collectors.toList());
        {

        }


    }

}
