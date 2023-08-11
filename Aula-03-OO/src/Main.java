public class Main {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        primeiraConta.titular = "Fulano de Tal";

        Conta segundaConta = new Conta();
        segundaConta.saldo = 250.34;
        segundaConta.titular = "Ciclano da Silva";

        System.out.println("Seu saldo é de R$ " + primeiraConta.saldo);

        primeiraConta.deposita(100);
        primeiraConta.saca(30);
        primeiraConta.transfere(20, segundaConta);
    }
}