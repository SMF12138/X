public class Student {
    private final String name;
    private final int preferredQuantity;
    private final PaperType preferredType;

    public Student(String name, int quantity, PaperType type) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty");
        }
        this.name = name;
        this.preferredQuantity = quantity;
        this.preferredType = type;
    }

    public int getPreferredQuantity() {
        return this.preferredQuantity;
    }

    public PaperType getPreferredPaperType() {
        return this.preferredType;
    }

    public String getName() {
        return this.name;
    }
}
