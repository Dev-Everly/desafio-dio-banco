public  abstract class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    private static int AGENCIA_PADRAO = 1 ;
    private   Cliente cliente;


    private int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public void imprimirExtrato() {

         System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }

   public  void sacar(double valor) {
        this.saldo -= valor;
    }

    public  void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia( ) {
        return agencia;
    }



    public int getNumero() {
        return numero;
    }


}
