// Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
// altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
// todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.

package ExercicioUm;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
  String name;
  String birthdate;
  double height;

  public Pessoa(String name, String birthdate, double height) {
    this.name = name;
    this.birthdate = birthdate;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void printPersonData() {
    System.out.printf(
        "Dados Pessoais:\n\tnome: %s\n\tdata de nascimento: %s\n\taltura: %.2f",
        name,
        birthdate,
        height);
  }

  public void calculationAge() {
    String[] date = this.birthdate.split("/");
    int day = Integer.parseInt(date[0]);
    int month = Integer.parseInt(date[1]);
    int year = Integer.parseInt(date[2]);
    // date of birth
    LocalDate pdate = LocalDate.of(year, month, day);
    // current date
    LocalDate now = LocalDate.now();
    // difference between current date and date of birth
    Period diff = Period.between(pdate, now);

    System.out.printf("\nO %s tem:  %d anos, %d meses e %d dias.\n\n",
        name, diff.getYears(), diff.getMonths(), diff.getDays());
  }

}
