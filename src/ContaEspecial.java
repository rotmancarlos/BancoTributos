// Classe ContaEspecial (subclasse de ContaBancaria)
class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (saldo + limite - valor >= 0) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
