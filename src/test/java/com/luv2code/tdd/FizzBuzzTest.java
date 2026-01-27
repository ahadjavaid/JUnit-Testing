package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
}
