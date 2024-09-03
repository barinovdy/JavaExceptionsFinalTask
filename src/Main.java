import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    private static final int fields_number = 6;

    public static void main(String[] args) {
        DataInput dataInput = new DataInput();
        DataInputCheck dataInputCheck = new DataInputCheck();
        String input = dataInput.ConsoleReader();

        String[] fields = input.split(" ");
        if (dataInputCheck.FieldNumberCheck(fields, fields_number)) {
            String lastName = fields[0];
            String firstName = fields[1];
            String middleName = fields[2];
            LocalDate birthDate = dataInputCheck.BirthDateCheck(fields);
            long phoneNumber = dataInputCheck.PhoneNumberCheck(fields);
            String gender = dataInputCheck.GenderCheck(fields);
            if (dataInputCheck.DataCheck(birthDate, phoneNumber, gender)) {
                Writer fileWriter = new Writer();
                String stringToWrite = lastName + " " + firstName + " " + middleName + " " + birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + phoneNumber + " " + gender;
                fileWriter.writeToFile(lastName, stringToWrite);
            }
        }
    }
}