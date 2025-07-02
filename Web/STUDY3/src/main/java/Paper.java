public class Paper {
    private final String title;

    public Paper(String title) {
        if (title == null || title.length() < 3) {
            throw new IllegalArgumentException("Title too short");
        }
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + "(" + this.getClass().getSimpleName() + ")";
    }
}

class Thesis extends Paper {
    public Thesis(String title) {
        super(title);
    }
}

class JournalPaper extends Paper {
    public JournalPaper(String title) {
        super(title);
    }
}

class ConferencePaper extends Paper {
    public ConferencePaper(String title) {
        super(title);
    }
}
