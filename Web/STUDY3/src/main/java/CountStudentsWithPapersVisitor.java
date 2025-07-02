import java.util.*;

public class CountStudentsWithPapersVisitor implements PaperSelectionVisitor {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void visit(PaperSelection selection) {
        Set<Student> students = new HashSet<>(selection.getSelections().values());
        this.count = students.size();
    }
}
