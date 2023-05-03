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
    public void testReverse(){

        LinkedList ListTest = new LinkedList();
        LinkedList EmptyList = new LinkedList();
        ListTest.add(3);
        ListTest.add(2);
        ListTest.add(1);
        assertEquals(ListTest, EmptyList.reverseAndAdd("123"));
        //assertEquals(ListTest.getHead().getNext().getKey(), EmptyList.reverseAndAdd("123").getHead().getNext().getKey());

    }
}
