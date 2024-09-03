import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Writer {
    public void writeToFile(String lastName, String stringToWrite){
        String fileName = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(stringToWrite);
            writer.newLine();
        } catch (IOException e){
            System.out.println("Ошибка записи!");
        }
    }
}
