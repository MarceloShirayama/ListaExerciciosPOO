// Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
// prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
// térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
// disponibilizar os seguintes métodos:
// a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
// prédio (os elevadores sempre começam no térreo e vazio);
// b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
// c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
// d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
// e. Desce: para descer um andar (não deve descer se já estiver no térreo);

package ExerciseFour;

public class BuildingElevator {
  private int currentFloor = 0;
  private int numberOfFloors;
  private int maximumCapacity;
  private int numberOfPeopleInElevator = 0;

  public BuildingElevator(int numberOfFloors, int maximumAapacity) {
    this.numberOfFloors = numberOfFloors;
    this.maximumCapacity = maximumAapacity;
  }

  public void enterInElevator(int numberOfPeople) {
    if (numberOfPeopleInElevator + numberOfPeople >= maximumCapacity) {
      System.out.println("O elevador está cheio.");
    } else {
      numberOfPeopleInElevator += numberOfPeople;
    }
  }

  public void exitElevator(int numberOfPeople) {
    if (numberOfPeopleInElevator - numberOfPeople < 0) {
      System.out.println("Não tem essa quantidade de pessoas no elevador.");
    } else {
      numberOfPeopleInElevator -= numberOfPeople;
    }
  }

  public void upElevator(int numberOfFloor) {
    if (numberOfFloor >= numberOfFloors) {
      System.out.println("Este andar não existe.");
    } else if (currentFloor == numberOfFloor) {
      System.out.println("Já estamos neste andar.");
    } else {
      currentFloor = numberOfFloor;
    }
  }

  public void downElevator(int numberOfFloor) {
    if (numberOfFloor <= 0) {
      System.out.println("Este andar não existe.");
    } else if (currentFloor == numberOfFloor) {
      System.out.println("Já estamos neste andar.");
    } else {
      currentFloor = numberOfFloor;

    }
  }

  @Override
  public String toString() {
    String message = String.format(
        "=".repeat(80)
            + "\nDados do elevador:\n\t"
            + "andar atual: %d\n\t"
            + "capacidade máxima: %d\n\t"
            + "número de andares: %d\n\t"
            + "número de pessoa no elevador: %d\n"
            + "=".repeat(80),
        currentFloor,
        maximumCapacity,
        numberOfFloors,
        numberOfPeopleInElevator);
    return message;
  }

}
