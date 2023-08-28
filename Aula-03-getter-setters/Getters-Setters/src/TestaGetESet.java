public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(2023);
        System.out.println(conta.getNumero());

        conta.setNumero(2024);
        System.out.println(conta.getNumero());
    }
}
