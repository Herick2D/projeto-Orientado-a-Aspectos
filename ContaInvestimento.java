import java.time.LocalDateTime;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(String tipoCliente, LocalDateTime dataAbertura, double saldoInicial) {
        super("Investimento", tipoCliente, dataAbertura, saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {

        return 20.00;
    }
}
