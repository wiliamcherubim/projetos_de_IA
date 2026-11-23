import java.util.Scanner;

public class Main {

    static class Conta {
        private int saldo;

        public Conta(int saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(int valor) {
            validarValor(valor);
            saldo += valor;
        }

        public void sacar(int valor) {
            validarValor(valor);

            if (valor > saldo) {
                throw new IllegalArgumentException("Erro: saldo insuficiente");
            }

            saldo -= valor;
        }

        public int getSaldo() {
            return saldo;
        }

        private void validarValor(int valor) {
            if (valor <= 0) {
                throw new IllegalArgumentException("Erro: valor invalido");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usamos next() e nextInt() para não quebrar com espaços ou quebras de linha
        if (scanner.hasNext()) {
            String operacao = scanner.next();
            int saldoInicial = scanner.nextInt();
            int valorOperacao = scanner.nextInt();

            Conta conta = new Conta(saldoInicial);

            try {
                if ("DEPOSITO".equals(operacao)) {
                    conta.depositar(valorOperacao);
                    System.out.println("Saldo final: " + conta.getSaldo());
                } else if ("SAQUE".equals(operacao)) {
                    conta.sacar(valorOperacao);
                    System.out.println("Saldo final: " + conta.getSaldo());
                } else {
                    System.out.println("Erro: operacao invalida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
