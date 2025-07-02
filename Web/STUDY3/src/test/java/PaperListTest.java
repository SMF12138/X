import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PaperListTest {

    @Test
    public void testSelectPaperByRandom_ValidSingleThesis() throws Exception {
        PaperList list = new PaperList("Rainy",
                Arrays.asList(
                        new Thesis("Reading"),
                        new ConferencePaper("Science"),
                        new JournalPaper("Technology"),
                        new JournalPaper("Art")
                )
        );
        Student student = new Student("Cloudy", 1, PaperType.Thesis);

        List<Paper> result = list.selectPaperByRandom(student);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0) instanceof Thesis);
    }

    @Test(expected = NoEnoughPapersException.class)
    public void testSelectPaperByRandom_NotEnoughPapers() throws Exception {
        PaperList list = new PaperList("Rainy",
                Arrays.asList(
                        new Thesis("Reading")
                )
        );
        Student student = new Student("Windy", 2, PaperType.Thesis);
        list.selectPaperByRandom(student);
    }

    @Test
    public void testSelectPaperByRandom_AnyType() throws Exception {
        PaperList list = new PaperList("Rainy",
                Arrays.asList(
                        new Thesis("Reading"),
                        new ConferencePaper("Science"),
                        new JournalPaper("Art")
                )
        );
        Student student = new Student("AnyType", 2, PaperType.Any);
        List<Paper> result = list.selectPaperByRandom(student);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectPaperByRandom_NullStudent() throws Exception {
        PaperList list = new PaperList("Rainy", Arrays.asList(new Thesis("Reading")));
        list.selectPaperByRandom(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testSelectPaperByRandom_RepeatedSelection() throws Exception {
        PaperList list = new PaperList("Rainy", Arrays.asList(new Thesis("Reading")));
        Student student = new Student("Cloudy", 1, PaperType.Thesis);
        list.selectPaperByRandom(student);
        list.selectPaperByRandom(student); // ‘Ÿ¥Œ—°‘Ò
    }
}
