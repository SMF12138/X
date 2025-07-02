import java.util.*;

public class PaperList {
    private final String teacher;
    private final List<Paper> papers;
    private final PaperSelection selections = new PaperSelection();

    public PaperList(String teacher, List<Paper> papers) {
        this.teacher = teacher;
        this.papers = new ArrayList<>(papers);
    }

    private List<Paper> getUnselectedPapersByType(PaperType type) {
        List<Paper> results = new ArrayList<>();
        for (Paper p : this.papers) {
            if (!selections.isSelected(p)) {
                if (type == PaperType.Any) {
                    results.add(p);
                } else if (type.name().equals(p.getClass().getSimpleName())) {
                    results.add(p);
                }
            }
        }
        return results;
    }

    public List<Paper> selectPaperByRandom(Student student) throws NoEnoughPapersException {
        if (student == null) {
            throw new IllegalArgumentException("student cannot be null");
        }

        if (selections.getSelections().containsValue(student)) {
            throw new IllegalStateException("student has already selected papers");
        }

        List<Paper> available = getUnselectedPapersByType(student.getPreferredPaperType());
        if (available.size() < student.getPreferredQuantity()) {
            throw new NoEnoughPapersException("学生 " + student.getName() + " 希望选论文 "
                    + student.getPreferredQuantity() + " 篇，但目前只有 "
                    + available.size() + " 篇可选");
        }

        Collections.shuffle(available);
        List<Paper> selected = new ArrayList<>();
        for (int i = 0; i < student.getPreferredQuantity(); i++) {
            Paper paper = available.get(i);
            selections.addSelection(student, paper);
            selected.add(paper);
        }

        return selected;
    }

    public void selectPaperByStrategy(Student student, PaperSelectionStrategy strategy) throws NoEnoughPapersException {
        List<Paper> available = getUnselectedPapersByType(student.getPreferredPaperType());
        if (available.size() < student.getPreferredQuantity()) {
            throw new NoEnoughPapersException("学生 " + student.getName() + " 希望选论文 "
                    + student.getPreferredQuantity() + " 篇，但目前只有 "
                    + available.size() + " 篇可选");
        }
        List<Paper> selected = strategy.select(available, student.getPreferredQuantity());
        for (Paper p : selected) {
            selections.addSelection(student, p);
        }
    }

    public PaperSelection getSelectionResult() {
        return this.selections;
    }
}
