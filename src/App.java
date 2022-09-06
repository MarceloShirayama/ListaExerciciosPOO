import ExercicioDois.CheckingAccount;
import ExercicioUm.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio Um
        Pessoa pessoa = new Pessoa(
                "Marcelo", "30/04/1970", 1.70F);

        pessoa.printPersonData();
        pessoa.calculationAge();

        // Exercicio Dois
        CheckingAccount account = new CheckingAccount("123456", "Marcelo");
        System.out.println(account.toString());
        account.deposit(1000);
        System.out.println(account.toString());
        account.draft(500);
        System.out.println(account.toString());
        account.setHolder("João");
        System.out.println(account.toString());
    }

}
