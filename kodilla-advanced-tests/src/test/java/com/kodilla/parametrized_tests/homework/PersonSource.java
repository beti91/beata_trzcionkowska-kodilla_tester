package com.kodilla.parametrized_tests.homework;



import org.junit.jupiter.params.provider.Arguments;


import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideArgumentsToTestBMI() {
        return java.util.stream.Stream.of(
                Arguments.of("Very severely underweight", new Person(1.70, 40)),
                Arguments.of("Severely underweight", new Person(1.70, 45)),
                Arguments.of("Underweight", new Person(1.70, 50)),
                Arguments.of("Normal (healthy weight)", new Person(1.70, 70)),
                Arguments.of("Overweight", new Person(1.70, 77)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.70, 90)),
                Arguments.of("Obese Class II (Severely obese)", new Person(1.70, 110)),
                Arguments.of("Obese Class III (Very severely obese)", new Person(1.70, 125)),
                Arguments.of("Obese Class IV (Morbidly Obese)", new Person(1.70, 135)),
                Arguments.of("Obese Class V (Super Obese)", new Person(1.70, 150)),
                Arguments.of("Obese Class VI (Hyper Obese)", new Person(1.70, 180))

        );

    }
}
