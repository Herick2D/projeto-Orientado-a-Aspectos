import java.time.LocalDateTime;

public class BancoMain {
    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca("Individual", LocalDateTime.now(), 1000);
        Conta contaInvestimento = new ContaInvestimento("Empresarial", LocalDateTime.now(), 5000);

        contaPoupanca.depositar(500);
        contaPoupanca.sacar(200);
        contaPoupanca.sacar(38948239);
        System.out.println("Tarifa de manutenção da poupança: " + contaPoupanca.calculaValorTarifaManutencao());

        contaInvestimento.depositar(1000);
        contaInvestimento.sacar(3000);
        System.out.println("Tarifa de manutenção da conta de investimento: " + contaInvestimento.calculaValorTarifaManutencao());
    }
}
