import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String tipoCliente, LocalDateTime dataAbertura, double saldoInicial) {
        super("Poupança", tipoCliente, dataAbertura, saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {

        return 5.00;
    }
}
