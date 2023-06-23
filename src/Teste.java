// Classe teste (Teste)

public class Teste {
    public static void main(String[] args) {
        // Criar contas
        ContaPoupanca contaPoupanca = new ContaPoupanca("Rotman", 1975, 32000, 10);
        ContaEspecial contaEspecial = new ContaEspecial("Gama", 2023, 85000, 10000);

        // Sacar um valor das contas
        contaPoupanca.sacar(1500);
        contaEspecial.sacar(3000);

        // Depositar
        contaPoupanca.depositar(2000);
        contaEspecial.depositar(500);

        // Mostrar novo saldo com rendimento
        contaPoupanca.calcularNovoSaldo(1.5);

        // Mostrar dados da conta do cliente
        contaPoupanca.mostrarDados();
        contaEspecial.mostrarDados();
    }
}