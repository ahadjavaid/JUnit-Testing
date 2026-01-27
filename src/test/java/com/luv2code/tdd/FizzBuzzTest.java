package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // if number is divisible by 3, print Fizz
    // if number is divisible by 5, print Buzz
    // if number is divisible by 3 and 5, print FizzBuzz
    // if number is not divisible by 3 and 5, then print the number

    @Test
    @DisplayName("Divisible by Three")
    @Order(1)
    void testForDivisibleByThree() {

        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "should return Fizz");
    }

    @Test
    @DisplayName("Divisible by Five")
    @Order(2)
    void testForDivisibleByFive() {

        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "should return Buzz");
    }

    @Test
    @DisplayName("Divisible by Three and Five")
    @Order(3)
    void testForDivisibleByThreeAndFive() {

        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "should return FizzBuzz");
    }

    @Test
    @DisplayName("Not Divisible by Three and Five")
    @Order(4)
    void testForNotDivisibleByThreeAndFive() {

        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "should return 1");
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @DisplayName("Testing with small data file")
    @Order(5)
    void testForSmallDataFile(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @DisplayName("Testing with small data file")
    @Order(6)
    void testForMediumDataFile(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @DisplayName("Testing with small data file")
    @Order(7)
    void testForLargeDataFile(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }
}
