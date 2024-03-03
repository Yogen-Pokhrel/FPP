package Assignment5.Problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Henry", LocalDate.parse("2020-05-10"), 12000, 12);
        Professor prof2 = new Professor("John doe", LocalDate.parse("2021-07-01"), 11000, 2);
        Professor prof3 = new Professor("Pra vice", LocalDate.parse("2022-09-01"), 14000, 21);
        Secretary sec1 = new Secretary("Veronica",LocalDate.parse("2018-02-01"), 5000 );
        Secretary sec2 = new Secretary("Priya",LocalDate.parse("2022-04-01"), 6000 );
        sec1.setOvertimeHours(18);
        sec2.setOvertimeHours(7);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = prof1;
        department[1] = prof2;
        department[2] = prof3;
        department[3] = sec1;
        department[4] = sec2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("There are " + department.length + " employees in the list, do you want to calculate the calculate the total salary?");
        System.out.println("If Yes type Y or Yes, otherwise any keys for no");
        String input = scanner.nextLine().toUpperCase();
        if((input.equals("Y") || input.equals("YES"))){
            calculateAndPrint(department);
        }else{
            System.out.println("You have chosen no, terminating the program");
        }
    }

    public static void calculateAndPrint(DeptEmployee[] department){
        double totalSalary = 0;
        for (DeptEmployee d : department){
            totalSalary += d.computeSalary();
        }
        System.out.println("The total salary of all employees is " + totalSalary);
    }
}
