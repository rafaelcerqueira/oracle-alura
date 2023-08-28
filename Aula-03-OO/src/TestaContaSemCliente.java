public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMaria = new Conta();
        System.out.println(contaDaMaria.saldo);

        contaDaMaria.titular = "Maria";
        System.out.println(contaDaMaria.titular);
    }
}
