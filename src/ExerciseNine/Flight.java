package ExerciseNine;

public class Flight {
  private String number;
  private String date;
  private String hour;
  private int maximumNumberOfPassengers = 100;
  private String[] seats = new String[maximumNumberOfPassengers];

  public Flight(String number, String date, String hour) {
    this.number = number;
    this.date = date;
    this.hour = hour;
  }

  public void getFlight() {
    System.out.println(
        "Vôo n." + number
            + "\n\tData: " + date
            + "\n\tHorário: " + hour);
  }

  public int nextFreeSeat() {
    for (int i = 0; i < this.seats.length; i++) {
      if (this.seats[i] == null) {
        return i;
      }
    }
    return -1;
  }

  public boolean checkSeatIsOccupied(int seatNumber) {
    boolean result = seats[seatNumber] == "occupied";

    return result;
  }

  public String reserveSeat(int seatNumber) {
    if (checkSeatIsOccupied(seatNumber)) {
      return "Assento n." + seatNumber + " não está disponível.";
    } else {
      seats[seatNumber] = "occupied";

      return "Assento n." + seatNumber + " reservado.";
    }

  }

  public void numberOfAvailableSeats() {
    int sum = 0;
    for (String seat : seats) {
      if (seat != "occupied") {
        sum++;
      }
    }
    System.out.println("Numero de assentos disponíveis: " + sum);
  }
}
