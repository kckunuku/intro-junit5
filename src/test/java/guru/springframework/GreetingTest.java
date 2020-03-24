package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @BeforeAll
    public static void before(){
        System.out.println("I am called before all....");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each.....");
    }

    @Test
    void helloWorld() {

        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {

        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("krishna"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each .......");
    }

    @AfterAll
    public static void after(){
        System.out.println("I am called after  all....!!!!!!!!!!!!!!!!");
    }
}