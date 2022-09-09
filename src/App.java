import ExerciseEight.Data;
import ExerciseExtra1.ThreadsTests;
import ExerciseFive.Student;
import ExerciseFour.BuildingElevator;
import ExerciseNine.Flight;
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

                // Exercise Eight
                Data data = new Data("30/04/1970");
                System.out.println(data.toString());
                System.out.println("dia: " + data.getDay());
                System.out.println("mês: " + data.getMonth());
                System.out.println("ano: " + data.getYear());
                System.out.println(data.getYear() + " é bissexto: " + data.leapYear());
                System.out.println("-".repeat(80) + "\n");
                Data data2 = new Data("06/07/1964");
                System.out.println(data2.toString());
                System.out.println("dia: " + data2.getDay());
                System.out.println("mês: " + data2.getMonth());
                System.out.println("ano: " + data2.getYear());
                System.out.println(data2.getYear() + " é bissexto: " + data2.leapYear());
                System.out.println("-".repeat(80) + "\n");
                Data data3 = data.clone();
                data3.setDate("30/04/2000");
                System.out.println(data3.toString());
                System.out.println("dia: " + data3.getDay());
                System.out.println("mês: " + data3.getMonth());
                System.out.println("ano: " + data3.getYear());
                System.out.println(data3.getYear() + " é bissexto: " + data3.leapYear());
                System.out.println("-".repeat(80) + "\n");
                System.out.println("Diferença entre: " + data + " e " + data2 + " = " + data.compare(data2));
                System.out.println("Diferença entre: " + data2 + " e " + data + " = " + data2.compare(data));
                System.out.println("Diferença entre: " + data2 + " e " + data3 + " = " + data2.compare(data3));
                Data data4 = data3.clone();
                data4.setDate("20/04/2000");
                System.out.println("Diferença entre: " + data3 + " e " + data4 + " = " + data3.compare(data4));
                Data data5 = data4.clone();
                System.out.println("Diferença entre: " + data5 + " e " + data4 + " = " + data5.compare(data4));
                System.out.println("=".repeat(80) + "\n");

                Flight flight = new Flight("123", "01/09/2022", "10:15");
                System.out.println(flight.reserveSeat(0));
                System.out.println(flight.reserveSeat(1));
                System.out.println(flight.reserveSeat(10));
                System.out.println(flight.reserveSeat(10));
                System.out.println("Próximo assento livre: n." + flight.nextFreeSeat());
                flight.numberOfAvailableSeats();
                flight.getFlight();
                System.out.println("=".repeat(80) + "\n");

                ThreadsTests.execute();
        }

}
