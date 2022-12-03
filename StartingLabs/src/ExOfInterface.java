interface Explore{
    void print();
}

class Ayu implements Explore{
    public void print(){
        System.out.println("Ayush: Exploring Different Places");
    }
}
class Rah implements Explore{
    public void print(){
        System.out.println("Rahul: Exploring Different Foods");
    }
}

public class ExOfInterface {
    public static void main(String[] args) {
        Explore ob1 = new Ayu();
        Explore ob2 = new Rah();
        ob1.print();ob2.print();;
    }
}
