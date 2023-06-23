// Classe ContaPoupanca (subclasse de ContaBancaria)

class ContaPoupanca extends ContaBancaria implements Tributavel {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.println("Novo saldo com rendimento: " + saldo);
    }

    public double calcularTributos() {
        return 0;
// Conta de Poupança não é tributável


    }
}
