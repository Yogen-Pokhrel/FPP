package Assignment3.Problem2;

import Assignment3.ErrorMessage;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.*;
import java.time.format.DateTimeFormatter;
public class Person {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    Person(){
        this.firstName = this.getFirstNameFromScanner();
        this.lastName = this.getLastNameFromScanner();
        this.birthday = this.getBirthdayFromScanner();
    }
    Person(String firstName, String lastName, LocalDate birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        int current = LocalDate.now().getYear();
        int birthYear = this.birthday.getYear();
        return current - birthYear;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getFirstNameFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your first name");
            String input = scanner.nextLine();
            try {
                if(isValidName(input)){
                    return input;
                }else{
                    ErrorMessage.printError("Invalid first name, Please try again");
                }
            } catch(Error e) {
                ErrorMessage.printError("Error! Please try again");
            }
        }
    }

    public String getLastNameFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your last name");
            String input = scanner.nextLine();
            try {
                if(isValidName(input)){
                    return input;
                }else{
                    ErrorMessage.printError("Invalid last name, Please try again");
                }
            } catch(Error e) {
                ErrorMessage.printError("Error! Please try again");
            }
        }
    }

    public LocalDate getBirthdayFromScanner() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);

                return birthday;

            } catch(DateTimeParseException e) {
                ErrorMessage.printError("Error! Please try again");
            }
        }
    }

    public static boolean isValidName(String name) {
        //regular expression for a valid name
        String regex = "^[a-zA-Z\\s'-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
