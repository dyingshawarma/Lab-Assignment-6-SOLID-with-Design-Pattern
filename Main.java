public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345);

        LibraryResource book = new Book();
        LibraryResource journal = new Journal();
        
        student.borrowResource(book, "Effective Java");
        student.borrowResource(journal, "Nature Journal");
    }
}
