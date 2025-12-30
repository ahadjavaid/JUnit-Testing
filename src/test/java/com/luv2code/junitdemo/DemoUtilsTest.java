package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {

        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9), "1+9 must be 10");
    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotEquals() {

        System.out.println("Running test: testNullAndNotEquals");

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not  be null");

    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame() {

        String str = "luv2code";

        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(), "Object should refer to the same object");
        assertNotSame(str,demoUtils.getAcademyDuplicate(), "Object should not refer to the same object");

    }

    @Test
    @DisplayName("True and False")
    void testTrueFalse() {

        int num1 = 10;
        int num2 = 5;

        assertTrue(demoUtils.isGreater(num1,num2), "This should return true");
        assertFalse(demoUtils.isGreater(num2,num1), "This should return false");
    }

    @Test
    @DisplayName("Array Equals")
    void testArrayEquals() {
        String [] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be same");
    }

    @Test
    @DisplayName("Iterable equals")
    void testIterableEquals() {
        List<String> theList = List.of("luv","2","code");

        assertIterableEquals(theList, demoUtils.getAcademyInList(),"Expected list should be same");
    }

    @Test
    @DisplayName("Lines match")
    void testLinesMatch() {

        List<String> theList = List.of("luv","2","code");

        assertLinesMatch(theList, demoUtils.getAcademyInList(),"Lines should match");
    }
}
