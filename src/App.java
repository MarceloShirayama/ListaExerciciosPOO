import ExerciseFive.Student;
import ExerciseFour.BuildingElevator;
import ExerciseOne.Pessoa;
import ExerciseSeven.Employee;
import ExerciseSix.Invoice;
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
                // double scoreGrade1 = Double.parseDouble(
                // JOptionPane.showInputDialog(null, "Insira a primeira nota"));
                // double scoreGrade2 = Double.parseDouble(
                // JOptionPane.showInputDialog(null, "Insira a segunda nota"));
                // double workScore = Double.parseDouble(
                // JOptionPane.showInputDialog(null, "Insira a segunda nota"));
                // student.addGradeScore(scoreGrade1);
                // student.addGradeScore(scoreGrade2);
                // student.addWorkScores(workScore);
                // student.average();
                // JOptionPane.showMessageDialog(
                // null,
                // student.average(),
                // "Informação",
                // JOptionPane.INFORMATION_MESSAGE);
                // System.out.println("=".repeat(80) + "\n");

                // Exercise Six
                Invoice invoice1 = new Invoice(
                                "123",
                                "Mouse Pad",
                                2,
                                10.50);
                System.out.println(invoice1.toString());
                Invoice invoice2 = new Invoice(
                                "124",
                                "Teclado",
                                0,
                                100.50);
                System.out.println(invoice2.toString());
                Invoice invoice3 = new Invoice(
                                "125",
                                "Mouse",
                                3,
                                0);
                System.out.println(invoice3.toString());
                System.out.println("=".repeat(80) + "\n");

                // Exercise Seven
                Employee employee1 = new Employee(
                                "Marcelo", "Shirayama", 5000);
                System.out.println(employee1.toString());
                System.out.println(employee1.toString());
                employee1.salaryReceived(12, 2021);
                employee1.salaryIncrease(10);
                employee1.salaryReceived(1, 2022);
                employee1.salaryReceived(2, 2022);
                employee1.salaryReceived(3, 2022);
                employee1.salaryReceived(4, 2022);
                employee1.salaryReceived(5, 2022);
                employee1.salaryReceived(6, 2022);
                employee1.salaryReceived(7, 2022);
                employee1.salaryReceived(8, 2022);
                employee1.salaryReceived(9, 2022);
                employee1.salaryReceived(10, 2022);
                employee1.salaryReceived(11, 2022);
                employee1.salaryReceived(12, 2022);
                System.out.println(employee1.toString());
                System.out.println(employee1.getSalariesReceived());
                System.out.println(employee1.getSalariesPaid());
                System.out.println("=".repeat(80) + "\n");
        }

}
