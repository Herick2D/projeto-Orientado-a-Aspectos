import java.time.LocalDateTime;

public abstract class Conta {
    private String tipoConta;
    private String tipoCliente;
    private LocalDateTime dataAbertura;
    private double saldo;

    public Conta(String tipoConta, String tipoCliente, LocalDateTime dataAbertura, double saldoInicial) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldoInicial;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
        System.out.println("Saque realizado: " + valor);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido.");
        }
        saldo += valor;
        System.out.println("Depósito realizado: " + valor);
    }

    public abstract double calculaValorTarifaManutencao();
}
