import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;





/**
 * This file contains JUnit tests for some sample arithmetic
 * expressions. This file tests your program "as a whole", by
 * checking its printed output.
 *
 * YOU SHOULD NOT WRITE YOUR OWN TESTS THIS WAY, OR IN THIS FILE.
 * You should test the individual UNITS in your program, i.e., call
 * your add, multiply, and exponentiate methods and test their return
 * values.
 */
public class SampleTest {
    /**
     * The actual standard output stream.
     */
    private PrintStream old;

    /**
     * The streams we're using to capture printed output.
     */
    private ByteArrayOutputStream baos;

    /**
     * Gets called before each test method. Need to do this so that we can
     * capture the printed output from each method.
     */
    @BeforeEach
    public void setUp() {
        this.old = System.out; // Save a reference to the original stdout stream.
        this.baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
    }

    @Test
    public void testSampleFile() {
        BigNumArithmetic.main(new String[] { "SampleInput.txt" });
        String output = this.baos.toString();
        assertEquals("1 + 2 = 3\n" +
                "2 ^ 4 = 16\n" +
                "3 * 5 = 15\n" +
                "2 ^ 40 = 1099511627776", output);
    }

    /**
     * Gets called after each test method. Need to do this so that we are
     * no longer capturing all printed output and printed stuff appears
     * like normal.
     */
    @AfterEach
    public void tearDown() {
        System.out.flush();
        System.setOut(this.old);
    }
    @Test
    public void testAddLinkedList(){
        LinkedList test = new LinkedList();

        test.add(1);
        test.add(2);
        test.add(3);

        assertEquals(1, test.getHead().getNext().getKey());
        assertEquals(2, test.getHead().getNext().getNext().getKey());
        assertEquals(3, test.getHead().getNext().getNext().getNext().getKey());

}

    @Test
    public void testSizeLinkedList() {
        LinkedList test = new LinkedList();

        test.add(1);
        test.add(2);
        test.add(3);
        assertEquals(3, test.size());
    }

    @Test
    public void testSizeLinkedList2() {
        LinkedList test = new LinkedList();
        assertEquals(0, test.size());
    }

    @Test
    public void testSizeLinkedList3() {
        LinkedList test = new LinkedList();

        test.add(1);
        test.add(2);
        test.add(3);
        test.add(10);
        assertEquals(4, test.size());
    }

    @Test
    public void testADD(){
        assertEquals("200", Operations.add_Operation("110", "90"));
        assertEquals("208774", Operations.add_Operation("198775", "9999"));
        assertEquals("10", Operations.add_Operation("9","1"));
        assertEquals("100", Operations.add_Operation("99","1"));
        assertEquals("100", Operations.add_Operation("100","00"));
        assertEquals("900", Operations.add_Operation("000","900"));
        assertEquals("80", Operations.add_Operation("0","80"));
        assertEquals("80", Operations.add_Operation("80","00"));
        assertEquals("100", Operations.add_Operation("000","100"));
        assertEquals("", Operations.add_Operation("2","15"));




    }

    @Test
    public void testMulti(){
//        assertEquals("8", Operations.multi("4", "2"));
//        assertEquals("63", Operations.multi("9", "7"));
//        assertEquals("5535", Operations.multi("123", "45"));
//        assertEquals("56088", Operations.multi("123", "456"));
//        assertEquals("120", Operations.multi("12", "10"));
//        assertEquals("144", Operations.multi("12", "12"));
//        assertEquals("80", Operations.multi("10", "8"));
//        assertEquals("56088", Operations.multi("456", "123"));
//        assertEquals("66661189804224", Operations.multi("6942069", "9602496"));
//        assertEquals("66657084", Operations.multi("6942", "9602"));
//        assertEquals("6664800", Operations.multi("69425", "96"));
       assertEquals("20", Operations.multi("2", "10"));



        //assertEquals("19435", Operations.multiply_operation("845", "23"));
        //assertEquals("16278925", Operations.multiply_operation("845", "19265"));
        //assertEquals("16289908342171365", Operations.multiply_operation("845545321", "19265565"));

    }

    @Test
    public void testExponent(){
        assertEquals("1", Operations.exponent_operation("2","0"));
        assertEquals("10000", Operations.exponent_operation("10","4"));
        assertEquals("4", Operations.exponent_operation("2","2"));
        assertEquals("1024", Operations.exponent_operation("4","5"));
        assertEquals("4096", Operations.exponent_operation("2","12"));
        assertEquals("1237940039285380274899124224", Operations.exponent_operation("2","90"));
        assertEquals("32768", Operations.exponent_operation("2","15"));
        assertEquals("100000000000000000000000000000000000000000000000000", Operations.exponent_operation("10","50"));

    }

    @Test
    public void test_sub(){
        assertEquals("104", Operations.subtract1("5", "105"));
        assertEquals("1", Operations.subtract1("2", "2"));

    }

    @Test
    public void testMakeEmpty(){
        LinkedList empty = new LinkedList();
        LinkedList test = new LinkedList();
        test.add(4);
        assertEquals(false, test.isEmpty());
        test.make_Empty();
        assertEquals(true, test.isEmpty());

    }

    public void test (){
        System.out.println(Operations.multi("45","2"));

    }
    }
