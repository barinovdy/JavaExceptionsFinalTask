import java.util.Scanner;

public class DataInput {
    public String ConsoleReader(){
        Scanner scanner = new Scanner((System.in));
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
