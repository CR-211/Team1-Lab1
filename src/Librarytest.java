import org.junit.Test;
import static org.junit.Assert.*;

public class Librarytest {

    @Test
    public void testInitialization() {
        Library library = new Library(2, 2, 4);

        // Verificăm că numărul de scriitori, cititori și cărți este inițializat corect
        assertEquals(2, library.writers.length);
        assertEquals(2, library.readers.length);
        assertEquals(4, Library.books);
    }

}