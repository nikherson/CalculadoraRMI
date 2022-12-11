import java.rmi.Naming;
import java.rmi.registry.*;

public class Servidor {
    public static void main (String[] args) throws Exception {

        //Criação do objeto remoto.
        Implementacao obj = new Implementacao();

        //Configuração da porta para atendimento da chamada dos clientes.
        LocateRegistry.createRegistry(5050);

        //Associação do objeto remoto com um "nome" ou endereço específico.
        Naming.rebind("rmi://localhost:5050/obj", obj);

        System.out.println("Servidor iniciado");
    }
}
