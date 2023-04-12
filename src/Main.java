public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Likita", 9.27, 123406789);
        student1.getInfo();
        student1.getInfo("Rutu", 9.3);
        student1.getInfo(9.12, "Dhruvi");
        System.out.println("\nStudents are of batch " + student1.getInfo(2023));
        Main.main("Likita");
    }

    public static void main(String name){
        ITStudent.display();
        ITStudent.display("Information Technology");
        ITStudent.display(name, "Information Technology");
    }
}