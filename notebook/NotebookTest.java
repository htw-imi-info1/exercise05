

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NotebookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NotebookTest
{
    private Notebook notebook1;

    /**
     * Default constructor for test class NotebookTest
     */
    public NotebookTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        notebook1 = new Notebook();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testGetAll()
    {
        notebook1.storeNote("a");
        notebook1.storeNote("b");
        notebook1.storeNote("c");
        assertEquals("a\nb\nc\n", notebook1.getAll());
    }
    
    @Test
    public void testGetAll2()
    {
        notebook1.storeNote("The Ticket Price is");
        notebook1.storeNote(""+320);
        notebook1.storeNote(" EUR");
        assertEquals("a\nb\nc\n", notebook1.getAll());
    }

    @Test
    public void testRemoveWithIndex1()
    {
        notebook1.storeNote("a");
        notebook1.storeNote("b");
        notebook1.storeNote("c");
        notebook1.storeNote("d");
        notebook1.removeWithIndex("b");
        java.lang.String string1 = notebook1.getAll();
        assertEquals("a\nc\nd\n", string1);
        System.out.println(string1);;
    }
    
     @Test
    public void testRemoveWithIndex2()
    {
        notebook1.storeNote("a");
        notebook1.storeNote("b");
        notebook1.storeNote("b");
        notebook1.storeNote("d");
        notebook1.removeWithIndex("b");
        java.lang.String string1 = notebook1.getAll();
        assertEquals("a\nd\n", string1);
        System.out.println(string1);;
    }
    
      @Test
    public void testGetNotesWith()
    {
        notebook1.storeNote("a");
        notebook1.storeNote("b");
        notebook1.storeNote("b");
        notebook1.storeNote("d");
        String result = notebook1.getNotesWith("b");
        java.lang.String string1 = notebook1.getAll();
        assertEquals("b\nb\n", string1);
        System.out.println(string1);;
    }
}


