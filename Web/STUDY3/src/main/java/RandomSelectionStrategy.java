import java.util.*;

public class RandomSelectionStrategy implements PaperSelectionStrategy {
    @Override
    public List<Paper> select(List<Paper> availablePapers, int quantity) {
        List<Paper> copy = new ArrayList<>(availablePapers);
        Collections.shuffle(copy);
        return copy.subList(0, quantity);
    }
}
