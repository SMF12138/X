import java.util.List;

public interface PaperSelectionStrategy {
    List<Paper> select(List<Paper> availablePapers, int quantity);
}
