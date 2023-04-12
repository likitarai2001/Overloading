public class Student {
    public String name;
    public double CGPA;
    private long enrollNo;

    Student(){
        System.out.println("Student class default constructor");
    }

    Student(String name, double CGPA, long enrollNo){
        this();
        this.name = name;
        this.CGPA = CGPA;
        this.enrollNo = enrollNo;
    }

    public void getInfo(){
        System.out.println("\nDetails\nName: " + this.name + "\nCGPA: " + this.CGPA + "\nEnrollment: " + this.enrollNo);
    }

    public void getInfo(String name, double CGPA){
        System.out.println("\nDetails\nName: " + name + "\nCGPA: " + CGPA);
    }

    public void getInfo(double CGPA, String name){
        System.out.println("\n" + CGPA + " is CGPA of " + name);
    }

    public int getInfo(int year){
        return year - 4;
    }


}
