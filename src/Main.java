public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.adicionarCliente(new Cliente("Everly"));
        banco.adicionarCliente(new Cliente("Bruce"));


        System.out.println("Total clientes: " + banco.getTotalClientes());
        banco.listarClientes();

        Conta cc = new ContaCorrente( );
        Conta poupa = new ContaPoupanca( );



        cc.depositar(200.00);

        cc.transferir(100.00, poupa);

        cc.imprimirExtrato();
        poupa.imprimirExtrato();

    }
}