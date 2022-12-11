import java.rmi.Naming;
import java.rmi.registry.*;

public class Servidor {
    public static void main (String[] args) throws Exception {

        Implementacao obj = new Implementacao();

        LocateRegistry.createRegistry(5050);

        Naming.rebind("rmi://localhost:5050/obj", obj);

        System.out.println("Servidor iniciado");
    }
}
