import java.util.Scanner;

class employee {
    int id, age;
    String name;
    employee(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        id = in.nextInt();
        age = in.nextInt();
    }
    void display (){
        System.out.println("E_ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.display();
        employee e2 = new employee();
        e2.display();
        employee e3 = new employee();
        e3.display();
        employee e4 = new employee();
        e4.display();
        employee e5 = new employee();
        e5.display();
    }
}
