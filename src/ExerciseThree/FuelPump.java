// Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
// seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
// atributos a classes deve conter os seguintes métodos.
// a.b.c.d.e.abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
// litros que foi colocada no veículo
// abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
// valor a ser pago pelo cliente.
// alterarValor; //altera o valor do litro do combustível.
// alterarCombustivel; //altera o tipo do combustível.
// alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.

package ExerciseThree;

public class FuelPump {
  private String fuelType;
  private double valuePerLiter;
  private double amountFuel;

  public FuelPump(String fuelType, double valuePerLiter, double amountFuel) {
    this.fuelType = fuelType;
    this.valuePerLiter = valuePerLiter;
    this.amountFuel = amountFuel;
  }

  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public double getValuePerLiter() {
    return valuePerLiter;
  }

  public void setValuePerLiter(double valuePerLiter) {
    this.valuePerLiter = valuePerLiter;
  }

  public double getAmountFuel() {
    return amountFuel;
  }

  public void fuelInput(double amount) {
    this.amountFuel += amount;
  }

  public String supplyByValue(double value) {
    amountFuel = amountFuel - (value / valuePerLiter);
    return String.format(
        "Quantidade de litros abastecido: %.2f", value / valuePerLiter);
  }

  public String supplyByLiter(double liter) {
    amountFuel = amountFuel - liter;
    // return "Valor do abastecimento: R$" + liter * valuePerLiter;
    return String.format(
        "Valor do abastecimento: R$ %.2f", liter * valuePerLiter);
  }

  @Override
  public String toString() {
    return "FuelPump [amountFuel=" + amountFuel + ", fuelType=" + fuelType + ", valuePerLiter=" + valuePerLiter + "]";
  }

}
