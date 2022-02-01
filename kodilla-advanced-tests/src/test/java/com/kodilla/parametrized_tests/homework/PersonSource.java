package com.kodilla.parametrized_tests.homework;



import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideStringToTestBMI() {
        return java.util.stream.Stream.of(
                Arguments.of("Normal (healthy weight)")
                );
    }
}
