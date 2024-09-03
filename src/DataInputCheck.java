import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataInputCheck {
    public boolean FieldNumberCheck(String[] fields, int fields_number){
        if (fields.length != fields_number) {
            System.err.println("Неверное количество полей, вы ввели" + fields.length + ", введите 6 полей");
            return false;
        }
        return true;
    }

    public LocalDate BirthDateCheck(String[] fields){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(fields[3], formatter);
        } catch (
                DateTimeParseException e) {
            System.err.println("Неверный формат даты");
            return null;
        }
    }

    public long PhoneNumberCheck(String[] fields){
        try {
            return Long.parseLong(fields[4]);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат телефона");
            return 0;
        }
    }

    public String GenderCheck(String[] fields){
        String gender = fields[5];
        if ((!"m".equals(gender)) && (!"f".equals(gender))){
            System.err.println("Неверный формат пола, введите f или m");
            return null;
        }
        return gender;
    }

    public boolean DataCheck(LocalDate birthDate, long phoneNumber, String gender){
        if (birthDate == null | phoneNumber == 0 | gender == null) {
            return false;
        }
        return true;
    }

}
