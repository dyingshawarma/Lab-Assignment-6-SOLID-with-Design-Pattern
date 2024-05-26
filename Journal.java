public class Journal implements LibraryResource {
    @Override
    public void borrow(String title) {
        // Implementation for borrowing a journal
        System.out.println("Borrowing journal: " + title);
    }
}

