/*
Crie uma classe chamada Invoice que possa ser utilizado por uma loja de 
suprimentos de informática para representar uma fatura de um item vendido na loja.
Uma fatura deve incluir as seguintes informações como atributos:

a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos.
Se a quantidade não for positiva, ela deve ser configurada como 0.
Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça os métodos getters e setters para cada variável de instância.
Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da 
fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o 
valor como um double. Escreva um aplicativo de teste que demonstra as
capacidades da classe Invoice.
 */

package ExerciseSix;

public class Invoice {
  private String invoicedItemNumber;
  private String itemDescription;
  private int quantityPurchasedItem = 0;
  private double unitPriceItem = 0.0;

  public Invoice(
      String invoicedItemNumber,
      String itemDescription,
      int quantityPurchasedItem,
      double unitPriceItem) {
    this.invoicedItemNumber = invoicedItemNumber;
    this.itemDescription = itemDescription;
    if (quantityPurchasedItem > 0)
      this.quantityPurchasedItem = quantityPurchasedItem;
    if (unitPriceItem > 0)
      this.unitPriceItem = unitPriceItem;
  }

  public double getInvoiceAmount() {
    return quantityPurchasedItem * unitPriceItem;
  }

  @Override
  public String toString() {
    String invoice = String.format(
        "Fatura n.: %s\n\t"
            + "Item: %s\n\t"
            + "Quantidade: %d\n\t"
            + "Preço Unitário: R$ %.2f\n\t"
            + "Preço Total: R$ %.2f",
        invoicedItemNumber,
        itemDescription,
        quantityPurchasedItem,
        unitPriceItem,
        getInvoiceAmount());
    return invoice;
  }

}
