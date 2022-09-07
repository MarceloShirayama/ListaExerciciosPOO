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

public class Employee {
  private String firstName;
  private String lastName;
  private double monthlySalary = 0.0;

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
    return monthlySalary * 12.0;
  }

  public void salaryIncrease(double increase) {
    this.monthlySalary = this.monthlySalary * (1 + increase / 100);
  }

  @Override
  public String toString() {
    String employee = String.format(
        "Empregado: %s %s\n\t"
            + "Salário mensal: R$ %.2f\n\t"
            + "Salário anual: R$ %.2f",
        firstName,
        lastName,
        monthlySalary,
        annualSalary());
    return employee;
  }

}
