public class Student {
    private String name;
    private int studentId;
    
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void borrowResource(LibraryResource resource, String title) {
        resource.borrow(title);
    }
}
