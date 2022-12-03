class student{
    int regNo;
    String name;
    String branch;
}

public class StudentDetails {
    public static void main(String[] args) {
        student a = new student();
        a.regNo = 20010408;
        a.name = "Ayush Kuamr";
        a.branch = "CSE (Ai & Ml)";
        System.out.println("Reg no.: " + a.regNo);
        System.out.println("Name: " + a.name);
        System.out.println("Branch: " + a.branch);
    }
}


