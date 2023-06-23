// Interface Tributavel
interface Tributavel {
    double calcularTributos();
}
// Classe ContaBancaria (superclasse abstrata)
abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado: " + valor);
    }

    public void mostrarDados() {
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}












