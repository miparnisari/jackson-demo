import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        Parser p = new Parser();
        try {
            p.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
