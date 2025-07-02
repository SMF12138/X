import java.util.*;

public class Main {
    public static void main(String[] args) {
        PaperList listOfRainy = new PaperList("Rainy",
                Arrays.asList(
                        new Thesis("Reading"),
                        new ConferencePaper("Science"),
                        new JournalPaper("Technology"),
                        new JournalPaper("Art")
                )
        );

        List<Student> students = Arrays.asList(
                new Student("Cloudy", 1, PaperType.Thesis),
                new Student("Sunny", 1, PaperType.JournalPaper),
                new Student("Windy", 2, PaperType.Any)
        );

        for (Student s : students) {
            try {
                List<Paper> selected = listOfRainy.selectPaperByRandom(s);
                System.out.println("学生 " + s.getName() + " 选择了：");
                for (Paper p : selected) {
                    System.out.println("\t" + p);
                }
            } catch (NoEnoughPapersException e) {
                System.out.println("选择失败：" + e.getMessage());
            }
        }

        System.out.println("\n=== 最终选择结果 ===");
        System.out.println(listOfRainy.getSelectionResult().toString());

        // Visitor演示
        CountStudentsWithPapersVisitor visitor = new CountStudentsWithPapersVisitor();
        listOfRainy.getSelectionResult().accept(visitor);
        System.out.println("已经选择论文的学生数量: " + visitor.getCount());
    }
}
