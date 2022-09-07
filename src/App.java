import javax.swing.JOptionPane;

import ExerciseFive.Student;
import ExerciseFour.BuildingElevator;
import ExerciseOne.Pessoa;
import ExerciseThree.FuelPump;
import ExerciseTwo.CheckingAccount;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercise One
        Pessoa pessoa = new Pessoa(
                "Marcelo", "30/04/1970", 1.70F);

        pessoa.printPersonData();
        pessoa.calculationAge();
        System.out.println("=".repeat(80) + "\n");

        // Exercise Two
        CheckingAccount account = new CheckingAccount("123456", "Marcelo");
        System.out.println(account.toString());
        account.deposit(1000);
        System.out.println(account.toString());
        account.draft(500);
        System.out.println(account.toString());
        account.setHolder("João");
        System.out.println(account.toString());
        System.out.println("=".repeat(80) + "\n");

        // Exercise Three
        FuelPump fuelPump = new FuelPump("gasoline", 5, 5000);
        System.out.println(fuelPump.toString());
        System.out.println(fuelPump.supplyByValue(20));
        System.out.println(fuelPump.supplyByLiter(10));
        System.out.println(fuelPump.toString());
        fuelPump.fuelInput(3000);
        System.out.println(fuelPump.toString());
        System.out.println("=".repeat(80) + "\n");

        // Exercise Four
        BuildingElevator elevator = new BuildingElevator(10, 15);
        elevator.enterInElevator(5);
        System.out.println(elevator.toString());
        elevator.upElevator(1);
        elevator.exitElevator(1);
        System.out.println(elevator.toString());
        elevator.upElevator(1);
        System.out.println("=".repeat(80) + "\n");

        // Exercise Five
        Student student = new Student("1234", "Marcelo", 7);
        double scoreGrade1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Insira a primeira nota"));
        double scoreGrade2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Insira a segunda nota"));
        double workScore = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Insira a segunda nota"));
        student.addGradeScore(scoreGrade1);
        student.addGradeScore(scoreGrade2);
        student.addWorkScores(workScore);
        student.average();
        JOptionPane.showMessageDialog(
                null,
                student.average(),
                "Informação",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("=".repeat(80) + "\n");
    }

}
