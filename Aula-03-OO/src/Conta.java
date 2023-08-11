public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
      this.saldo += valor;
      if (valor > 0) {
          System.out.println("Depósito feito com sucesso!");
      } else {
          System.out.println("Erro ao fazer depósito");
      }

      System.out.println("Seu saldo é de R$ " + saldo);
    };

    public void saca(double valor) {
        if (this.saldo > 0) {
            if (valor > this.saldo) {
                System.out.println("Valor maior do que o saldo.");
            } else if (valor <= this.saldo) {
                this.saldo = this.saldo - valor;

                System.out.println("Saque feito com sucesso!");
                System.out.println("Seu novo saldo é R$ " + this.saldo);
            }
        } else {
            System.out.println("Saldo insuficiente! Deposite algum valor na conta.");
        }
    }

    public void transfere(double valor, Conta destino) {
        if (this.saldo > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Transferência realizada com sucesso! Seu novo saldo é de R$ " + this.saldo);
            } else {
                System.out.println("Valor maior do que o saldo!");
            }
        } else {
            System.out.println("Saldo insuficiente! Deposite algum valor na conta.");
        }
    }
}
