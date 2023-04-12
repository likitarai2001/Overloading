public class ITStudent{
    final static String college = "LD College of Engineering";

    protected static void display(){
        System.out.println("\nCollege: " + college);
    }

    protected static void display(String dept){
        System.out.println("\nDepartment: " + dept);
    }

    protected static void display(String name, String dept){
        System.out.println("\n" + name + " is in " + dept);
    }
}
