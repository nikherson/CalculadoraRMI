import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementacao extends UnicastRemoteObject implements Interface {
    Implementacao() throws RemoteException { super(); }
    public BigDecimal add(String x, String y) throws RemoteException {
        BigDecimal valor1 = new BigDecimal(x);
        BigDecimal valor2 = new BigDecimal(y);
        return valor1.add(valor2);
    }
    public BigDecimal sub(String x, String y) throws RemoteException {
        BigDecimal valor1 = new BigDecimal(x);
        BigDecimal valor2 = new BigDecimal(y);
        return valor1.subtract(valor2);
    }
    public BigDecimal mul(String x, String y) throws RemoteException {
        BigDecimal valor1 = new BigDecimal(x);
        BigDecimal valor2 = new BigDecimal(y);
        return valor1.multiply(valor2);
    }
    public BigDecimal div(String x, String y) throws RemoteException {
        BigDecimal valor1 = new BigDecimal(x);
        BigDecimal valor2 = new BigDecimal(y);
        return valor1.divide(valor2);
    }
}
