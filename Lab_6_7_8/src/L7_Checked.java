import java.io.FileNotFoundException;
import java.io.FileReader;

public class L7_Checked {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            System.out.println("Checked Exception");
            FileReader fr = new FileReader("name.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Exception: "+ e);
        }
    }
}
