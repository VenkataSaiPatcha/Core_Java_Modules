package Object_Oriented_Programmings;
class Student05 {
    static String schoolName = "ABC School"; // stored in Method Area
    String name; // stored in Heap (per object)

    Student05(String name) {
        this.name = name;
    }
}

public class BluePrint {
    public static void main(String[] args) {
    	Student05 s1 = new Student05("Alice");
    	Student05 s2 = new Student05("Bob");

        System.out.println(s1.schoolName); // ABC School
        System.out.println(s2.schoolName); // ABC School

        Student05.schoolName = "XYZ School";

        System.out.println(s1.schoolName); // XYZ School
        System.out.println(s2.schoolName); // XYZ School
    }
}
