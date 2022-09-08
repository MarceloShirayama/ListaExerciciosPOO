package ExerciseSeven;

public class SalaryPaid {
  public double salary;
  public int month;
  public int year;

  public SalaryPaid(double salary, int month, int year) {
    this.salary = salary;
    this.month = month;
    this.year = year;
  }

  public SalaryPaid() {
  }

  @Override
  public String toString() {
    String listSalaries = String.format(
        "%d-%d - R$ %.2f",
        month, year, salary);
    return listSalaries;
  }

}
