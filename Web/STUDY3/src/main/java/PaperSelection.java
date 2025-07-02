import java.util.*;

public class PaperSelection {
    private final Map<Paper, Student> selections;

    public PaperSelection() {
        selections = new HashMap<>();
    }

    public boolean addSelection(Student student, Paper paper) {
        if (selections.containsKey(paper)) {
            return false;
        }
        selections.put(paper, student);
        return true;
    }

    public boolean isSelected(Paper paper) {
        return selections.containsKey(paper);
    }

    public Map<Paper, Student> getSelections() {
        return Collections.unmodifiableMap(selections);
    }

    public void accept(PaperSelectionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Paper, Student> entry : selections.entrySet()) {
            str.append(entry.getKey().toString())
                    .append("\tselected by ")
                    .append(entry.getValue().getName())
                    .append("\n");
        }
        return str.toString();
    }
}
