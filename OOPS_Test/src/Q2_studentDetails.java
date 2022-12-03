class student{
    void display(int reg, int age, String name){
        System.out.println("Reg. No: " + reg);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Q2_studentDetails {
    public static void main(String[] args) {
        student ob1 = new student();
        student ob2 = new student();

        ob1.display(20010408, 19, "Ayush Kumar");
        ob2.display(20010415, 20, "Rahul Ranjan");
    }
}
