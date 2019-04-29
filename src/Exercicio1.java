public class Exercicio1 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jorge");
        cliente1.setSobrenome("Osiro");

        Conta conta1 = new Conta();
        conta1.setNumeroDaConta("1234-5");
        conta1.setSaldo(0F);
        conta1.setTitular(cliente1);

        conta1.imprimirDados();

        conta1.depositar(500F);
        conta1.sacar(10000000000000000F);
        conta1.sacar(90F);

        conta1.imprimirDados();
    }

}
