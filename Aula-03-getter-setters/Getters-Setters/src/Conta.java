public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;

        if (valor > 0) {
            System.out.println("Depósito feito com sucesso!");
        } else {
            System.out.println("Erro ao fazer o depósito.");
        }
        System.out.println("Seu saldo é de R$ " + saldo);
    }

    public void saca(double valor) {
        if (this.saldo > 0) {
            System.out.println("Valor maior do que o saldo.");
        } else if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;

            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Seu novo saldo é de R$ " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente! Por favor, deposite algum valor na conta.");
        }
    }

    public void transfere(double valor, Conta destino, Conta origem) {

        int agenciaDaContaDestino = destino.agencia;
        int numeroDaContaDestino = destino.numero;

        int agenciaDaContaOrigem, numeroDaContaOrigem;
        agenciaDaContaOrigem = origem.agencia;
        numeroDaContaOrigem = origem.numero;

        if(agenciaDaContaDestino != 0 && numeroDaContaDestino != 0 && agenciaDaContaOrigem != 0 && numeroDaContaOrigem != 0) {
            if (this.saldo > 0) {
                if(valor <= this.saldo) {
                    this.saldo -= valor;
                    System.out.println("Transferência realizada com sucesso! Seu novo saldo é de R$ " + this.saldo);
                } else {
                    System.out.println("Valor maior do que o saldo!");
                }
            } else {
                System.out.println("Saldo insuficiente! Por favor, deposite algum valor na conta.");
            }
        }

    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

}
