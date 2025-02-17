import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static int totalClientes= 0;


    private List<Cliente> clientes;

    public Banco () {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        totalClientes++;
    }


    public   int getTotalClientes() {
        return totalClientes;
    }



    public void listarClientes() {
        System.out.println("Clientes do banco:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
