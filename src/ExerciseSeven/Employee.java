/*
 A fim de representar funcionários em uma empresa, crie uma classe chamada 
 Funcionario que inclui as três informações a seguir como atributos:

a. um primeiro nome,
b. um sobrenome
c. um salário mensal

Sua classe deve ter um construtor que inicializa os três atributos. 
Forneça os métodos getters e setters para cada atributo. 

Se o salário mensal não for positivo, configure-o como 0.0. 

Escreva um aplicativo de teste que demonstra as capacidades da classe. 
Crie duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual 
de cada empregado.
 */
package ExerciseSeven;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String firstName;
  private String lastName;
  private double monthlySalary = 0.0;
  private List<SalaryPaid> salariesPaid = new ArrayList<>();
  List<Double> salariesReceived = new ArrayList<>();

  public List<SalaryPaid> getSalariesPaid() {
    return salariesPaid;
  }

  public List<Double> getSalariesReceived() {
    return salariesReceived;
  }

  public Employee(String firstName, String lastName, double monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    if (monthlySalary > 0)
      this.monthlySalary = monthlySalary;
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

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public double annualSalary() {
    double annualSalary = 0;
    if (salariesPaid.size() > 0) {
      if (this.salariesPaid.size() > 12) {
        for (int i = 0; i < 12; i++) {
          salariesReceived.add(this.salariesPaid.get(12 - i).salary);
        }
        double sumSalaries = salariesReceived
            .stream()
            .reduce(0.0, (subtotal, element) -> subtotal + element);
        int quantitySalaries = salariesReceived.size();

        annualSalary = sumSalaries / quantitySalaries;

      } else {
        for (int i = 0; i < salariesPaid.size(); i++) {
          salariesReceived.add(this.salariesPaid.get(salariesPaid.size() - 1 - i).salary);
        }
        double sumSalaries = salariesReceived
            .stream()
            .reduce(0.0, (subtotal, element) -> subtotal + element);
        int quantitySalaries = salariesReceived.size();

        annualSalary = sumSalaries / quantitySalaries;
      }
    }
    return annualSalary;
  }

  public void salaryIncrease(double increase) {
    this.monthlySalary = this.monthlySalary * (1 + increase / 100);
  }

  public void salaryReceived(int month, int year) {
    SalaryPaid salaryReceived = new SalaryPaid(this.monthlySalary, month, year);
    this.salariesPaid.add(salaryReceived);
  }

  @Override
  public String toString() {
    String employee = String.format(
        "Empregado: %s %s\n\t"
            + "Salário mensal atual: R$ %.2f\n\t"
            + "Salário anual: R$ %.2f",
        firstName,
        lastName,
        monthlySalary,
        annualSalary());
    return employee;
  }

}
