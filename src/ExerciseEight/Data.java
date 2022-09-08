package ExerciseEight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Data {
  String date;
  private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public Data(String date) {
    if (isValid(date)) {
      this.date = date;
    } else {
      this.date = "01/01/0001";
    }
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return this.date;
  }

  public boolean isValid(String dateStr) {
    try {
      LocalDate.parse(dateStr, this.formatter);
    } catch (DateTimeParseException e) {
      return false;
    }
    return true;
  }

  public int getDay() {
    return LocalDate.parse(this.date, formatter).getDayOfMonth();
  }

  public int getMonth() {
    return LocalDate.parse(this.date, formatter).getMonthValue();
  }

  public int getYear() {
    return LocalDate.parse(this.date, formatter).getYear();
  }

  public boolean leapYear() {
    int year = getYear();
    boolean case1 = (year % 4.0 == 0) && (year % 100.0 != 0);
    boolean case2 = (year % 4.0 == 0) && (year % 100.0 == 0) && (year % 400 == 0);
    if (case1 || case2)
      return true;
    return false;
  }

  public Data clone() {
    return new Data(this.date);
  }

  public String compare(Data object) {
    LocalDate otherObject = LocalDate.parse(object.date, formatter);
    LocalDate atualObject = LocalDate.parse(this.date, formatter);
    int diff = atualObject.compareTo(otherObject);
    if (atualObject.getYear() != otherObject.getYear()) {
      return diff + " anos";
    } else if (atualObject.getMonthValue() != otherObject.getMonthValue()) {
      return diff + " meses";
    } else if (atualObject.getDayOfMonth() != otherObject.getDayOfMonth()) {
      return diff + " dias";
    }
    return "0";
  }
}
