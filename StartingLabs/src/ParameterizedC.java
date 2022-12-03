class one{
    one(int side){
        System.out.println("This is super class, area: "+ side*side);
    }
}
class two extends one{
    two(int side) {
        super(side);
    }
}

public class ParameterizedC {
    public static void main(String[] args) {
        two ob = new two(9);
    }
}
